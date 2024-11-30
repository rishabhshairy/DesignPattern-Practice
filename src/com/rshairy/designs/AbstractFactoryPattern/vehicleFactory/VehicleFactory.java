package com.rshairy.designs.AbstractFactoryPattern.vehicleFactory;

import com.rshairy.designs.AbstractFactoryPattern.vehicle.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicle(String brand);
}
