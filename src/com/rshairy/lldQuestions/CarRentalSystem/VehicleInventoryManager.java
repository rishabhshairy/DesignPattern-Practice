package com.rshairy.lldQuestions.CarRentalSystem;

import com.rshairy.lldQuestions.CarRentalSystem.product.Vehicle;

import java.util.List;

public class VehicleInventoryManager {
    List<Vehicle> vehicleList;

    public VehicleInventoryManager(List<Vehicle> list){
        this.vehicleList = list;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
