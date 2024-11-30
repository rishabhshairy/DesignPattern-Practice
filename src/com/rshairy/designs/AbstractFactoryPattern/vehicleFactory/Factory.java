package com.rshairy.designs.AbstractFactoryPattern.vehicleFactory;

public class Factory {

    public VehicleFactory getFactory(String segment) {
        switch (segment) {
            case "LUXURY":
                return new LuxuryVehicle();
            case "ORDINARY":
                return new OrdinaryVehicle();
            default:
                return null;
        }
    }
}
