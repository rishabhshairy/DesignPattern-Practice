package com.rshairy.lldQuestions.CarRentalSystem;

import com.rshairy.lldQuestions.CarRentalSystem.product.Vehicle;
import com.rshairy.lldQuestions.CarRentalSystem.product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManager inventoryManager;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();

    // method to get all vehicles at current store
    public List<Vehicle> getVehicles(VehicleType car) {
        return inventoryManager.getVehicleList();
    }

    //addVehicles, update vehicles, use inventory management to update those.

    public void setVehicles(List<Vehicle> vehicles) {
        inventoryManager = new VehicleInventoryManager(vehicles);
    }

    // create reservation at store
    public Reservation createReservation(Vehicle vehicle, User user) {
        Reservation reservation = new Reservation();
        reservation.reserveVehicleForUser(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationId) {
        // filter the reservations based on ID provided
        return true;
    }
}
