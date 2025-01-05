package com.rshairy.designs.TemplateDesignPattern;

public class PaymentToMerchant extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Merchant Validated");
    }

    @Override
    public void debitMoney() {
        System.out.println("Money Debited");

    }

    @Override
    public void calculateFees() {
        System.out.println("2% Transaction Fees");

    }

    @Override
    public void creditMoney() {
        System.out.println("Merchant Credited");
    }
}
