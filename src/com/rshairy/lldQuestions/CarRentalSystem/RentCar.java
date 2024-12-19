package com.rshairy.lldQuestions.CarRentalSystem;

import com.rshairy.lldQuestions.CarRentalSystem.product.Vehicle;
import com.rshairy.lldQuestions.CarRentalSystem.product.VehicleRentalSystem;
import com.rshairy.lldQuestions.CarRentalSystem.product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class RentCar {
    public static void main(String[] args) {
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        // ini inverntory manager
        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(stores,users);

        // step 1 -- user will come to store
        User user = users.get(0);

        // search to vehicle to be booked based on location
        Location location = new Location(560097,"Bengaluru","Karnataka","India");
        Store store = rentalSystem.getStore(location);

        // 3 get all vehicles based on filter
        // we can add more filters to it
        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);

        Vehicle chosenVehicle = storeVehicles.get(0);

        // Book the desired vehicle
        Reservation reservation = store.createReservation(chosenVehicle,user);

        // generate bill
        Bill bill = new Bill(reservation);

        // Pay bill
        Payment payment = new Payment();
        payment.payBill(bill);

        // complete reservation
        store.completeReservation(reservation.reservationId);

    }

    private static List<Store> addStores(List<Vehicle> vehicles) {
        Store store1 = new Store();
        store1.storeId = 1;
        store1.setVehicles(vehicles);

        List<Store> stores = new ArrayList<>();
        stores.add(store1);
        return stores;
    }

    private static List<Vehicle> addVehicles() {
        Vehicle v1 = new Vehicle();
        v1.setVehicleID(1);
        v1.setVehicleType(VehicleType.CAR);

        Vehicle v2 = new Vehicle();
        v2.setVehicleID(2);
        v2.setVehicleType(VehicleType.CAR);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(v1);
        vehicles.add(v2);

        return vehicles;
    }

    private static List<User> addUsers() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setUserId(1);
        user.setUserName("rishabh");
        user.setDriverLicNo(121111);

        users.add(user);

        return users;
    }
}
