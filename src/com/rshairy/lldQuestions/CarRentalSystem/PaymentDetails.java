package com.rshairy.lldQuestions.CarRentalSystem;

import com.rshairy.lldQuestions.CarRentalSystem.constants.PaymentMode;

import java.util.Date;

public class PaymentDetails {
    int paymentId;
    int amountPaid;
    Date dateOfPayment;
    boolean isRefundable;
    PaymentMode paymentMode;

}
