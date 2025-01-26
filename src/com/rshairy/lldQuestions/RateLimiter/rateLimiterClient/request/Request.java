package com.rshairy.lldQuestions.RateLimiter.rateLimiterClient.request;

public abstract class Request {
    String id;
    String serviceName;

    public Request(String id, String serviceName) {
        this.id = id;
        this.serviceName = serviceName;
    }

    public String getId() {
        return id;
    }
}
