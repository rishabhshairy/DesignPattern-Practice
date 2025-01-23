package com.rshairy.lldQuestions.ApplyCoupon.product;

public class ElectronicsItem extends Product{

    public ElectronicsItem(Integer productId, String name, double price, ProductType productType) {
        super(productId, name, price, productType);
    }

    @Override
    public double getPrice() {
        return originalPrice;
    }
}
