package com.rshairy.lldQuestions.parkingLot.spot;

import com.rshairy.lldQuestions.parkingLot.strategy.ParkingStrategy;

import java.util.List;

public class FourWheelerParkingSpotManager implements ParkingSpotManager {

    List<FourWheelerParkingSpot> fourWheelerParkingSpots;
    ParkingStrategy strategy;

    public FourWheelerParkingSpotManager(List<FourWheelerParkingSpot> fourWheelerParkingSpots, ParkingStrategy nearToEntryElevator) {
        this.fourWheelerParkingSpots = fourWheelerParkingSpots;
        this.strategy = nearToEntryElevator;
    }


    @Override
    public void addParkingSpace() {

    }

    @Override
    public void removeParkingSpace() {

    }

    @Override
    public void parkVehicle() {
        System.out.println("Parked Four Wheeler");
    }

    @Override
    public void removeVehicle() {

    }
}
