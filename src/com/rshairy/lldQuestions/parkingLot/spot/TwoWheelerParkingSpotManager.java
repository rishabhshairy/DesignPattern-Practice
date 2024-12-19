package com.rshairy.lldQuestions.parkingLot.spot;

import com.rshairy.lldQuestions.parkingLot.strategy.ParkingStrategy;

import java.util.List;

public class TwoWheelerParkingSpotManager implements ParkingSpotManager {
    List<TwoWheelerParkingSpot> twoWheelerParkingSpots;
    ParkingStrategy strategy;

    public TwoWheelerParkingSpotManager(List<TwoWheelerParkingSpot> twoWheelerParkingSpots, ParkingStrategy nearToEntryStrategy) {
        this.twoWheelerParkingSpots = twoWheelerParkingSpots;

    }

    @Override
    public void addParkingSpace() {

    }

    @Override
    public void removeParkingSpace() {

    }

    @Override
    public void parkVehicle() {
        System.out.println("Parked Two Wheeler");
    }

    @Override
    public void removeVehicle() {

    }
}
