package com.rshairy.lldQuestions.parkingLot.strategy;

import com.rshairy.lldQuestions.parkingLot.spot.ParkingSpot;

public class NearToEntryStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot find() {
        // use heap to implement
        return new ParkingSpot();
    }
}
