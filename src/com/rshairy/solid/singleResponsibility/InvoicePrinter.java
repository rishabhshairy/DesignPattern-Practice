package com.rshairy.solid.singleResponsibility;

public class InvoicePrinter {
    Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print(){
        // print invoice
    }
}
