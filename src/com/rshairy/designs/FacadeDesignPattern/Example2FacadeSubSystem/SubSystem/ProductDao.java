package com.rshairy.designs.FacadeDesignPattern.Example2FacadeSubSystem.SubSystem;

public class ProductDao {
    public Product getProduct() {
        System.out.println("Product Fetched");
        return new Product();
    }
}
