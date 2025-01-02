package com.rshairy.designs.SingletonPattern.eager;

public class DBConnection {
    private static DBConnection instance = new DBConnection();

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        return instance;
    }
}
