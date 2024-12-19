package com.rshairy.lldQuestions.parkingLot.factory;

import com.rshairy.lldQuestions.parkingLot.model.VehicleType;
import com.rshairy.lldQuestions.parkingLot.spot.*;
import com.rshairy.lldQuestions.parkingLot.strategy.NearToEntryElevator;
import com.rshairy.lldQuestions.parkingLot.strategy.NearToEntryStrategy;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotFactory {


   public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerParkingSpotManager(getTwoWheelerParkingSpots(), new NearToEntryStrategy());
            case FOUR_WHEELER:
                return new FourWheelerParkingSpotManager(getFourWheelerParkingSpots(), new NearToEntryElevator());
            default:
                return null;
        }
    }

    List<TwoWheelerParkingSpot> getTwoWheelerParkingSpots() {
        List<TwoWheelerParkingSpot> twoWheelerParkingSpots = new ArrayList<>();
        twoWheelerParkingSpots.add(new TwoWheelerParkingSpot());
        twoWheelerParkingSpots.add(new TwoWheelerParkingSpot());
        twoWheelerParkingSpots.add(new TwoWheelerParkingSpot());
        twoWheelerParkingSpots.add(new TwoWheelerParkingSpot());
        twoWheelerParkingSpots.add(new TwoWheelerParkingSpot());
        twoWheelerParkingSpots.add(new TwoWheelerParkingSpot());
        twoWheelerParkingSpots.add(new TwoWheelerParkingSpot());
        twoWheelerParkingSpots.add(new TwoWheelerParkingSpot());

        return twoWheelerParkingSpots;
    }

    List<FourWheelerParkingSpot> getFourWheelerParkingSpots() {
        List<FourWheelerParkingSpot> fourWheelerParkingSpots = new ArrayList<>();
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot());
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot());
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot());
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot());
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot());
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot());
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot());
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot());
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot());
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot());
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot());

        return fourWheelerParkingSpots;
    }
}
