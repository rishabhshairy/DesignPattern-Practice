package com.rshairy.lldQuestions.ApplyCoupon;

import com.rshairy.lldQuestions.ApplyCoupon.product.*;

public class Application {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product usbCable = new ElectronicsItem(1001,"USB-Cable",350.9, ProductType.ELECTRONICS);
        Product bodywash = new CosmeticItem(1002,"BodyWash",150, ProductType.COSMETICS);
        Product knife = new KitchenToolItem(1003,"Knife",100, ProductType.KITCHEN_TOOLS);

        cart.addToCart(usbCable);
        cart.addToCart(bodywash);
        cart.addToCart(knife);
        cart.checkout();
    }
}
