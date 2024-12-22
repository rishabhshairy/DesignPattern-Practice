package com.rshairy.designs.NULLDesignPattern;

public class VehicleFactory {
    public Vehicle getVehicle(String type) {
        switch (type) {
            case "Car":
                return new Car();
            default:
                return new NULLVehicle();
        }
    }
}
