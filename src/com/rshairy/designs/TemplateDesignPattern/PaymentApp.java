package com.rshairy.designs.TemplateDesignPattern;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentFlow payment = new PaymentToFriend();
        payment.sendMoney();

        payment = new PaymentToMerchant();
        payment.sendMoney();
    }
}
