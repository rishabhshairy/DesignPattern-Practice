package com.rshairy.lldQuestions.parkingLot;

import com.rshairy.lldQuestions.parkingLot.factory.ParkingSpotFactory;
import com.rshairy.lldQuestions.parkingLot.model.Vehicle;
import com.rshairy.lldQuestions.parkingLot.model.VehicleType;
import com.rshairy.lldQuestions.parkingLot.spot.ParkingSpotManager;

public class EntryGate {
    ParkingSpotFactory parkingSpotFactory;
    ParkingSpotManager parkingSpotManager;

    public EntryGate() {
        parkingSpotFactory = new ParkingSpotFactory();
    }

    /**
     * Scale this to use gate number
     *
     * @param type
     * @return
     */
    ParkingSpotManager findSpace(VehicleType type) {
        return parkingSpotFactory.getParkingSpotManager(type);

    }

    void bookSpot(Vehicle vehicle) {
        this.parkingSpotManager = findSpace(vehicle.getVehicleType());
        this.parkingSpotManager.parkVehicle();

    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleNo(12121212112L);
        vehicle.setVehicleType(VehicleType.FOUR_WHEELER);

        EntryGate entryGate = new EntryGate();
        entryGate.bookSpot(vehicle);
    }
}
