package com.rshairy.solid.singleResponsibility;

/**
 * This class does not follow Single Responsibility Principle as it have 3 reason to change
 * 1. Calculating Total Price logic can change
 * 2. Printing logic can change
 * 3. Saving to DB can change
 */
public class InvoiceNonSRP {
    private Marker marker;
    private int quantity;

    public InvoiceNonSRP(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    void calculateTotalPrice(){
        //
    }

    void print(){
        //
    }

    void saveToDB() {
        //
    }
}
