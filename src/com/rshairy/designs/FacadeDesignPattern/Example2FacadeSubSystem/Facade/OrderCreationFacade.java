package com.rshairy.designs.FacadeDesignPattern.Example2FacadeSubSystem.Facade;

import com.rshairy.designs.FacadeDesignPattern.Example2FacadeSubSystem.SubSystem.Invoice;
import com.rshairy.designs.FacadeDesignPattern.Example2FacadeSubSystem.SubSystem.Payment;
import com.rshairy.designs.FacadeDesignPattern.Example2FacadeSubSystem.SubSystem.ProductDao;
import com.rshairy.designs.FacadeDesignPattern.Example2FacadeSubSystem.SubSystem.SendNotification;

public class OrderCreationFacade {
    ProductDao productDao;
    Payment payment;
    Invoice invoice;
    SendNotification notification;

    public OrderCreationFacade() {
        productDao = new ProductDao();
        payment = new Payment();
        invoice = new Invoice();
        notification = new SendNotification();
    }

    public String createOrder() {
        productDao.getProduct();
        payment.makePayment();
        invoice.generateInvoice();
        return notification.sendNotification();
    }
}
