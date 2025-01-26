package com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.request;

public abstract class Request {
    String serviceName;
    String id;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
