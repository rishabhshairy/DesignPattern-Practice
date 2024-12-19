package com.rshairy.lldQuestions.parkingLot.model;

import com.rshairy.lldQuestions.parkingLot.spot.ParkingSpot;

import java.time.LocalDateTime;

public class Ticket {
    long vehicleNo;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    LocalDateTime entryTime;

    public long getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(long vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }
}
