package com.rshairy.designs.SingletonPattern.ThDoubleLock;

public class DBConnectionDoubleLocking {

    private static DBConnectionDoubleLocking instance;

    private DBConnectionDoubleLocking() {

    }

    public static DBConnectionDoubleLocking getInstance() {
        if (instance == null) {
            synchronized (DBConnectionDoubleLocking.class) {
                if (instance == null) {
                    instance = new DBConnectionDoubleLocking();
                }
            }
        }
        return instance;
    }
}
