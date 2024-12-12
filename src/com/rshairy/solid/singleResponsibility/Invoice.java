package com.rshairy.solid.singleResponsibility;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    int calculateTotal(Marker marker, int quantity) {
        return marker.getPrice() * quantity;
    }
}
