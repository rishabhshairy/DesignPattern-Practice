package com.rshairy.lldQuestions.CarRentalSystem;

public class Bill {
    Reservation reservation;
    boolean isPaid;
    double amount;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.isPaid = false;
        this.amount = computeBillAmount();
    }

    private double computeBillAmount() {
        return 100;
    }
}
