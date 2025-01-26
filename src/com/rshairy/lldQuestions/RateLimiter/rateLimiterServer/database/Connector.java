package com.rshairy.lldQuestions.RateLimiter.rateLimiterServer.database;

import java.util.List;

public class Connector {
    public void updateDB() {

    }

    /**
     * @implNote Making readDB return a generic response
     * @implSpec Define generic methods for reading from DB
     * @param sql
     * @param clazz
     * @param <T>
     * @return List<T>
     *
     */
    public <T> List<T> readDB(String sql, Class<T> clazz) {

    }
}
