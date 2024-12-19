package com.rshairy.lldQuestions.parkingLot.model;

public class Vehicle {
    long vehicleNo;
    VehicleType vehicleType;

    public long getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(long vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
