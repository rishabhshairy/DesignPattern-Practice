package com.rshairy.lldQuestions.RateLimiter.rateLimiterClient.api;

import com.rshairy.lldQuestions.RateLimiter.rateLimiterClient.model.ServiceConfiguration;
import com.rshairy.lldQuestions.RateLimiter.rateLimiterClient.request.ReadConfigRequest;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class RateLimiterServer {
    String ipAddress;

    public CompletableFuture<ServiceConfiguration> getServiceConfig(String serviceName) {
        new ReadConfigRequest(UUID.randomUUID().toString(), serviceName);
        // read service config
        // sendMessage
        return null;
    }

    public CompletableFuture<Map<String, Limit>> readKey() {
        return null;
    }

    public CompletableFuture<Void> updateKey(String key, int amount, long l) {
        return null;
    }
}
