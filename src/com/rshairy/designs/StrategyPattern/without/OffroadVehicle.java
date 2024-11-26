package com.rshairy.designs.StrategyPattern.without;

public class OffroadVehicle extends Vehicle{

    /**
     * Same code is also duplicated in SportsVehicle class
     * this is violating the strategy design principles
     */
    public void drive() {
        // Normal Drive Capability
        System.out.println("Special Drive");
    }
}
