package com.rshairy.designs.TemplateDesignPattern;

public abstract class PaymentFlow {
    public abstract void validateRequest();

    public abstract void debitMoney();

    public abstract void calculateFees();

    public abstract void creditMoney();

    /**
     * No one will override this method
     * and any class extending this will
     * follow this steps for sending money
     */
    public final void sendMoney() {
        validateRequest();
        debitMoney();
        calculateFees();
        creditMoney();
    }
}
