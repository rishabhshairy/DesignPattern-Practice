package com.rshairy.lldQuestions.RateLimiter.rateLimiterClient.algorithm;

public abstract class Algorithm {
    public abstract  <RESOURCE> void backPressure(RESOURCE request);

    public abstract boolean shouldAccept();
}
