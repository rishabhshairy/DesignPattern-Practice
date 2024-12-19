package com.rshairy.lldQuestions.parkingLot.strategy;

import com.rshairy.lldQuestions.parkingLot.spot.FourWheelerParkingSpot;
import com.rshairy.lldQuestions.parkingLot.spot.ParkingSpot;

public class NearToEntryElevator implements ParkingStrategy{
    @Override
    public ParkingSpot find() {
        // implement using heap
        return new FourWheelerParkingSpot();
    }
}
