package com.rshairy.solid.liskovSubstitution.non;

public class MotorCycle implements Bike {
    int speed;
    boolean isEngineOn;

    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
    }

    @Override
    public void accelerate() {
        this.speed += 10;
    }
}
