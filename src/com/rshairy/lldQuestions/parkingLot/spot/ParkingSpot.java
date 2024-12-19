package com.rshairy.lldQuestions.parkingLot.spot;

import com.rshairy.lldQuestions.parkingLot.model.Vehicle;

public class ParkingSpot {
    int id;
    boolean isEmpty;
    Vehicle vehicle;
    int price;

    void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = true;
    }

    void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }

}
