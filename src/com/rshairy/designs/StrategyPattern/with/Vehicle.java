package com.rshairy.designs.StrategyPattern.with;

import com.rshairy.designs.StrategyPattern.with.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy strategy;

    // do a constructor injection
    public Vehicle(DriveStrategy _strategy) {
        this.strategy = _strategy;
    }

    public void drive() {
        strategy.drive();
    }
}
