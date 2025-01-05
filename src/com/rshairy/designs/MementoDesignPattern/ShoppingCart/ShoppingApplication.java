package com.rshairy.designs.MementoDesignPattern.ShoppingCart;

public class ShoppingApplication {
    public static void main(String[] args) {
        CartHistory cartHistory = new CartHistory();
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addCartItem("Macbook pro 15inch");
        shoppingCart.addCartItem("iphone 16 promax");

        cartHistory.saveItem(shoppingCart);

        shoppingCart.addCartItem("Magic Mouse");

        System.out.println("Current Shopping Cart::" + shoppingCart);

        shoppingCart.restoreFromMemento(cartHistory.undo());
        System.out.println("Current Shopping Cart::" + shoppingCart);

        System.out.println();

    }
}
