package com.rshairy.designs.AbstractFactoryPattern.vehicleFactory;

import com.rshairy.designs.AbstractFactoryPattern.vehicle.Audi;
import com.rshairy.designs.AbstractFactoryPattern.vehicle.Bmw;
import com.rshairy.designs.AbstractFactoryPattern.vehicle.Vehicle;

public class LuxuryVehicle implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String brand) {
        switch (brand) {
            case "AUDI":
                return new Audi();
            case "BMW":
                return new Bmw();
            default:
                return null;
        }
    }
}
