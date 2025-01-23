package com.rshairy.lldQuestions.ApplyCoupon.product;

public class CosmeticItem extends Product{
    public CosmeticItem(Integer productId, String name, double price, ProductType productType) {
        super(productId, name, price, productType);
    }

    @Override
    public double getPrice() {
        return originalPrice;
    }
}
