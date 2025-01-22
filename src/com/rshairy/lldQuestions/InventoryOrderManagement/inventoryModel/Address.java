package com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel;

public class Address {
    int pincode;
    String streetName;

    public Address(int pincode, String streetName) {
        this.pincode = pincode;
        this.streetName = streetName;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
