package com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.controller;


import com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.dao.RateLimiterDAO;
import com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.request.UpdateRequest;
import com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.response.UpdateResponse;

import java.util.concurrent.CompletableFuture;

/**
 * All of these APIs will need to be stored in controller
 */
public class RateLimiter {

    private RateLimiterDAO dao;

    /**
     * @param request
     * @return
     * @implNote Here thenAccept() or thenApply() will cause concurrency problem and block all threads
     * * but we will do a separation of concern here use ThreadPool outside this class to handle all the
     * * DB Update requests, so that the user is not blocked because of a DB update operation
     * @implNote For a particular key, update request is making changes in DB
     *           Looking at controller we can say what tables its using and whether its fine or not
     */
    public CompletableFuture<UpdateResponse> updateKeyMetrics(UpdateRequest request) {

        return updateLimit(request.getServiceName(), request.getKey(), request.getCount(), request.getTimestamp())
                .thenApply(__ -> new UpdateResponse());
    }

    /**
     * @param serviceName
     * @param key
     * @param count
     * @param timestamp
     * @return CompletableFuture to make sure operations are completed
     * @implNote Update limit of service in DB
     */
    private CompletableFuture<Void> updateLimit(String serviceName, String key, int count, long timestamp) {
        // Update in DB
        return dao.updateLimit();
    }
}
