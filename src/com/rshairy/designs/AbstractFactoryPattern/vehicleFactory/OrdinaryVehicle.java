package com.rshairy.designs.AbstractFactoryPattern.vehicleFactory;

import com.rshairy.designs.AbstractFactoryPattern.vehicle.*;

public class OrdinaryVehicle implements VehicleFactory {


    @Override
    public Vehicle getVehicle(String brand) {
        switch (brand) {
            case "AUDI":
                return new SuzukiSwift();
            case "BMW":
                return new Hyundai();
            default:
                return null;
        }
    }
}