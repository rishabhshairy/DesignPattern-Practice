package com.rshairy.designs.MementoDesignPattern.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

/**
 * This is originator here
 */
public class ShoppingCart {
    private List<String> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void setCartItems(List<String> cartItems) {
        this.cartItems = cartItems;
    }

    public void addCartItem(String item) {
        cartItems.add(item);
    }

    public CartMemento createCartMemento() {
        return new CartMemento(this.cartItems);
    }

    public void restoreFromMemento(CartMemento restoreMemento) {
        this.cartItems = new ArrayList<>(restoreMemento.getCartItems());
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartItems=" + cartItems +
                '}';
    }
}
