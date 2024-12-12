package com.rshairy.solid.openClosedPrinciple;

import com.rshairy.solid.singleResponsibility.Invoice;

public interface InvoiceDAO {
    void save(Invoice invoice);
}
