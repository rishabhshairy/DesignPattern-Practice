package com.rshairy.designs.SingletonPattern.lazy;

public class DBConnectionLazy {
    private static DBConnectionLazy instance = null;

    private DBConnectionLazy() {

    }

    public static DBConnectionLazy getInstance() {
        if (instance == null) {
            return new DBConnectionLazy();
        }
        return instance;
    }
}
