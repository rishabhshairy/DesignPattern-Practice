package com.rshairy.lldQuestions.CarRentalSystem;

import com.rshairy.lldQuestions.CarRentalSystem.constants.ReservationStatus;
import com.rshairy.lldQuestions.CarRentalSystem.constants.ReservationType;
import com.rshairy.lldQuestions.CarRentalSystem.product.Vehicle;

import java.util.Date;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public int reserveVehicleForUser(User user, Vehicle vehicle) {
        reservationId = 1234;
        this.user=user;
        this.vehicle=vehicle;
        reservationType=ReservationType.DAILY;
        reservationStatus=ReservationStatus.SCHEDULED;

        return reservationId;
    }

    // CRUD for reservation Object
}
