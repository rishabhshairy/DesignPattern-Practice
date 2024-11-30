package com.rshairy.designs.AbstractFactoryPattern;

import com.rshairy.designs.AbstractFactoryPattern.vehicle.Vehicle;
import com.rshairy.designs.AbstractFactoryPattern.vehicleFactory.Factory;
import com.rshairy.designs.AbstractFactoryPattern.vehicleFactory.VehicleFactory;

public class Producer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        VehicleFactory vehicleFactory = factory.getFactory("LUXURY");
        Vehicle vehicle = vehicleFactory.getVehicle("AUDI");
        System.out.println(vehicle.average());
    }
}
