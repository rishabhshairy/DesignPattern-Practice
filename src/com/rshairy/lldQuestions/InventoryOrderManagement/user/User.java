package com.rshairy.lldQuestions.InventoryOrderManagement.user;

import com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel.Address;

import java.util.ArrayList;
import java.util.List;

public class User {
    int id;
    String name;
    Cart cart;
    Address address;
    List<Integer> orderId;


    public User() {
        cart = new Cart();
        orderId = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Integer> getOrderId() {
        return orderId;
    }

    public void setOrderId(List<Integer> orderId) {
        this.orderId = orderId;
    }
}
