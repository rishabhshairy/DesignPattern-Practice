package com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.api;

import com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.controller.RateLimiter;
import com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.controller.ServiceConfig;
import com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.models.ServiceConfiguration;
import com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.request.UpdateRequest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class APIGateway {

    private RateLimiter rateLimiter;
    private ServiceConfig serviceConfig;

    public ExecutorService executorService = Executors.newFixedThreadPool(10);

    public void updateKey(String json) {
        CompletableFuture
                .runAsync(() -> rateLimiter.updateKeyMetrics(toObject(json, UpdateRequest.class)), executorService)
                .thenAccept(response -> client.returnResponse(response));
    }

    public void updateServiceConfig(String json) {
        CompletableFuture.runAsync(() -> serviceConfig.updateServiceConfig(toObject(json, ServiceConfiguration.class)), executorService);
    }

    /**
     * @param json
     * @param clazz
     * @param <T>
     * @return
     * @implNote This will convert JSON to Object
     * We can use GSON Library
     */
    private <T> T toObject(String json, Class<T> clazz) {
        return null;
    }
}
