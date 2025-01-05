package com.rshairy.designs.MementoDesignPattern.ShoppingCart;

import java.util.Stack;

public class CartHistory {
    private Stack<CartMemento> cartHistory = new Stack<>();

    public void saveItem(ShoppingCart shoppingCart) {
        cartHistory.add(shoppingCart.createCartMemento());
    }

    public CartMemento undo() {
        if (!cartHistory.isEmpty()) {
            CartMemento restorePoint = cartHistory.pop();
            return restorePoint;
        }
        return null;
    }
}
