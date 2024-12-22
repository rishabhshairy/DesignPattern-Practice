package com.rshairy.designs.NULLDesignPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        // get vehicle objectc
        Vehicle vehicle = factory.getVehicle("Car");
        printVehicleData(vehicle);
    }

    private static void printVehicleData(Vehicle vehicle) {
        System.out.println(vehicle.getSeatingCapacity());
        System.out.println(vehicle.getTankCapacity());
    }
}
