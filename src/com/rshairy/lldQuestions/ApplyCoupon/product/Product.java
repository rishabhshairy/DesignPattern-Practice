package com.rshairy.lldQuestions.ApplyCoupon.product;

public abstract class Product {
    private Integer productId;
    private String name;
    protected double originalPrice;
    ProductType productType;

    public Product(){
    }

    public Product(Integer productId, String name, double price, ProductType productType) {
        this.productId = productId;
        this.name = name;
        this.originalPrice = price;
        this.productType = productType;
    }

    public ProductType getProductType() {
        return productType;
    }

    public abstract double getPrice();

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
}
