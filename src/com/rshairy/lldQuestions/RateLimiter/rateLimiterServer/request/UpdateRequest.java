package com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.request;

/**
 * This class will store the
 */
public class UpdateRequest extends Request {
    String key;
    long timestamp;
    int count;

    public String getKey() {
        return key;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public int getCount() {
        return count;
    }
}
