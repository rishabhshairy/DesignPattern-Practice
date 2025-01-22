package com.rshairy.lldQuestions.InventoryOrderManagement.orderModel;

import com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel.Address;
import com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel.Warehouse;
import com.rshairy.lldQuestions.InventoryOrderManagement.payment.Payment;
import com.rshairy.lldQuestions.InventoryOrderManagement.payment.PaymentMode;
import com.rshairy.lldQuestions.InventoryOrderManagement.payment.UPIPaymentMode;
import com.rshairy.lldQuestions.InventoryOrderManagement.user.User;

import java.util.Map;

public class Order {
    User user;
    Address deliveryAddress;
    Map<Integer, Integer> productCategoryAndCountMap;
    Warehouse warehouse;
    Invoice invoice;
    Payment payment;
    OrderStatus orderStatus;

    Order(User user, Warehouse warehouse){
        this.user = user;
        this.productCategoryAndCountMap = user.getCart().viewCart();
        this.warehouse = warehouse;
        this.deliveryAddress = user.getAddress();
        invoice = new Invoice();
        invoice.generateInvoice(this);
    }

    public void checkout(){

        //1. update inventory
        warehouse.removeItemFromInventory(productCategoryAndCountMap);

        //2. make Payment
        boolean isPaymentSuccess = makePayment(new UPIPaymentMode());

        //3. make cart empty
        if(isPaymentSuccess) {
            user.getCart().emptyCart();
        }
        else{
            warehouse.addItemToInventory(productCategoryAndCountMap);
        }

    }

    public boolean makePayment(PaymentMode paymentMode){
        payment = new Payment(paymentMode);
        return payment.makePayment();
    }

    public void generateOrderInvoice(){
        invoice.generateInvoice(this);
    }

}
