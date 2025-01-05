package com.rshairy.designs.TemplateDesignPattern;

public class PaymentToFriend extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Friend Validated");
    }

    @Override
    public void debitMoney() {
        System.out.println("Money Debited");

    }

    @Override
    public void calculateFees() {
        System.out.println("No fees for personal transaction");

    }

    @Override
    public void creditMoney() {
        System.out.println("Friend Credited");
    }
}
