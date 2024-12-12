package com.rshairy.solid.singleResponsibility;

public class InvoiceDAO {
    Invoice invoice;

    public InvoiceDAO(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // save to DB
    }
}
