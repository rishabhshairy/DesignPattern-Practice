package com.rshairy.lldQuestions.RateLimiter.rateLimiterClient.api;

import com.rshairy.lldQuestions.RateLimiter.rateLimiterClient.algorithm.Algorithm;
import com.rshairy.lldQuestions.RateLimiter.rateLimiterClient.algorithm.SlidingWindow;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

/**
 * This servers as client
 */
public class RateLimiter<RESOURCE> {
    private RateLimiterServer rateLimiterServer;
    private String serviceName;

    // we should accept two functions onAccept and onReject
    private Function<RESOURCE, CompletableFuture<Void>> onAccept;
    private Function<RESOURCE, CompletableFuture<Void>> onReject;
    private Algorithm algorithm;
    // to make IO calls on separate thread
    private ExecutorService executorService;

    public RateLimiter(String serviceName, int threadCount) throws Exception {
        this(serviceName, null, null, null, threadCount);
    }

    public RateLimiter(String serviceName, Function<RESOURCE, CompletableFuture<Void>> onAccept,
                       Function<RESOURCE, CompletableFuture<Void>> onReject,
                       Algorithm algorithm,
                       int threadCount) throws Exception {
        this.serviceName = serviceName;
        this.onAccept = onAccept;
        this.onReject = onReject;
        this.executorService = Executors.newFixedThreadPool(threadCount);
        this.algorithm = algorithm == null ? new SlidingWindow(rateLimiterServer.getServiceConfig(serviceName).get()) : algorithm;
    }

    public CompletableFuture<Map<String, Limit>> readKey(String json) {
        return CompletableFuture.supplyAsync(() -> rateLimiterServer.readKey(), executorService)
                .thenCompose(Function.identity());
    }

    public CompletableFuture<Void> updateKey(String key, int amount) {
        return CompletableFuture.supplyAsync(() -> rateLimiterServer.updateKey(key, amount, System.currentTimeMillis()), executorService)
                .thenCompose(Function.identity());
    }


    /**
     * @param request
     * @return
     * @implNote These make callbacks very flexible
     */
    public CompletableFuture<Void> onAccept(RESOURCE request) {
        return onAccept.apply(request);
    }

    public CompletableFuture<Void> onReject(RESOURCE request) {
        this.algorithm.backPressure(request);
        return onReject.apply(request);
    }

    /**
     * @param request
     * @return
     * @implNote VVIMP Function
     */
    public boolean canAccept(RESOURCE request) {

        return this.algorithm.shouldAccept();
    }
}
