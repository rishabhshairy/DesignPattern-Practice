package com.rshairy.lldQuestions.BookMyShow;

import com.rshairy.lldQuestions.BookMyShow.models.Seat;
import com.rshairy.lldQuestions.BookMyShow.models.Show;

import java.util.List;

public class Booking {
    Show bookedShow;
    List<Seat> bookedSeats;
    Payment payment;

    public Show getBookedShow() {
        return bookedShow;
    }

    public void setBookedShow(Show bookedShow) {
        this.bookedShow = bookedShow;
    }

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
