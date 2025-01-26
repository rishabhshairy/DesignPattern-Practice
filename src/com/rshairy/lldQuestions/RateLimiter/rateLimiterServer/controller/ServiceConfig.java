package com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.controller;

import com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.dao.ServiceConfigDAO;
import com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.models.ServiceConfiguration;

import java.util.concurrent.CompletableFuture;

public class ServiceConfig {
    private ServiceConfigDAO dao;

    public CompletableFuture<Void> updateServiceConfig(ServiceConfiguration configuration) {
        return dao.updateServiceConfig(configuration);
    }
}
