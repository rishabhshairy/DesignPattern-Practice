package com.rshairy.solid.liskovSubstitution.non;

/**
 * Now this class is narrowing down the functionality of parent class
 * as bicycles do not have engine capability
 */
public class BiCycle implements Bike{
    @Override
    public void turnOnEngine() {
        throw new AssertionError("Invalid Operation");
    }

    @Override
    public void accelerate() {

    }
}
