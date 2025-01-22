package com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel;

import java.util.List;
import java.util.Map;

public class Inventory {
    List<ProductCategory> productCategories;



    public void addProductCategory(ProductCategory productCategory) {
        productCategories.add(productCategory);
    }

    public void removeProductCategory(int count){
        for (int i = 1; i < count; i++) {
            productCategories.remove(0);
        }
    }

    public void removeItems(Map<Integer, Integer> productCategoryAndCountMap) {
       //TODO
    }

    // Getters and Setters
    public List<ProductCategory> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(List<ProductCategory> productCategories) {
        this.productCategories = productCategories;
    }
}
