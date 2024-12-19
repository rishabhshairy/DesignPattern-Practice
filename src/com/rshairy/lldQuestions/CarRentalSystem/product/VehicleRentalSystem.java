package com.rshairy.lldQuestions.CarRentalSystem.product;

import com.rshairy.lldQuestions.CarRentalSystem.Location;
import com.rshairy.lldQuestions.CarRentalSystem.Store;
import com.rshairy.lldQuestions.CarRentalSystem.User;

import java.util.List;

public class VehicleRentalSystem {
    List<Store> stores;
    List<User> users;

    public VehicleRentalSystem(List<Store> stores, List<User> users) {
        this.stores = stores;
        this.users = users;
    }

    public Store getStore(Location location) {
        return stores.get(0);
    }
}
