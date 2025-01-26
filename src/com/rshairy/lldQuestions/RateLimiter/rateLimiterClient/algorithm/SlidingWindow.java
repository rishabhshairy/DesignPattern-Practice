package com.rshairy.lldQuestions.RateLimiter.rateLimiterClient.algorithm;

import com.rshairy.lldQuestions.RateLimiter.rateLimiterClient.model.ServiceConfiguration;

public class SlidingWindow extends Algorithm {
    public SlidingWindow(ServiceConfiguration configuration) {

    }

    @Override
    public <RESOURCE> void backPressure(RESOURCE request) {

    }

    @Override
    public boolean shouldAccept() {
        return true;
    }
}
