package com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.models;

import java.util.concurrent.TimeUnit;

public class ServiceConfiguration {
    String service;
    String key;
    TimeUnit timeUnit;
    int limit;


}
