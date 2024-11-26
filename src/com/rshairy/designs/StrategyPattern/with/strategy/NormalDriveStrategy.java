package com.rshairy.designs.StrategyPattern.with.strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}
