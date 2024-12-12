package com.rshairy.solid.interfaceSegregation.non;

/**
 * Here in this class Waiter is un-necessarily implementing non-related functionality
 *
 */
public class Waiter implements ResturantEmployee{
    @Override
    public void washDishes() {
        // not my job
    }

    @Override
    public void serveCustomers() {
        System.out.println("Yes this is my job");
    }

    @Override
    public void cookFood() {
        // not my job
    }
}
