package com.rshairy.designs.MementoDesignPattern.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class CartMemento {
    private List<String> cartItems;

    public CartMemento(List<String> cartItems) {
        this.cartItems = new ArrayList<>(cartItems);
    }

    public List<String> getCartItems() {
        return cartItems;
    }
}
