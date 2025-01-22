package com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
    int categoryId;
    String categoryName;
    List<Product> products;
    Double price;

    public ProductCategory() {
        products = new ArrayList<>();
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(int count){
        for (int i = 1; i < count; i++) {
            products.remove(0);
        }
    }
}
