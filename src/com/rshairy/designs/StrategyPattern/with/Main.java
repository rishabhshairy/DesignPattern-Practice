package com.rshairy.designs.StrategyPattern.with;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
        vehicle=new OffroadVehicle();
        vehicle.drive();
    }
}
