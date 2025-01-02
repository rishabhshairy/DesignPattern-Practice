package com.rshairy.designs.SingletonPattern.ThreadSafe;

/**
 * Also known as Synchronized
 * Problem with this is
 * if too many threads are accessing it will be very expensive operation
 * as each thread will lock the getInstance() method
 */
public class DBConnectionThreadSafe {
    private static DBConnectionThreadSafe instance;

    private DBConnectionThreadSafe() {

    }

    synchronized public static DBConnectionThreadSafe getInstance() {
        if (instance == null) {
            return new DBConnectionThreadSafe();
        }
        return instance;
    }
}
