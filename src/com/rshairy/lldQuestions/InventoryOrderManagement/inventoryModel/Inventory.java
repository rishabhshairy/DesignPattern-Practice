package com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventory {
    List<ProductCategory> productCategories;

    public Inventory() {
        this.productCategories = new ArrayList<>();
    }

    public void removeItems(Map<Integer, Integer> productCategoryAndCountMap) {
        for(Map.Entry<Integer, Integer> entry : productCategoryAndCountMap.entrySet())
        {
            ProductCategory category = getProductCategoryFromID(entry.getKey());
            category.removeProduct(entry.getValue());
        }

    }
    private ProductCategory getProductCategoryFromID(int productCategoryId){

        for(ProductCategory productCategory : productCategories){

            if(productCategory.categoryId == productCategoryId){
                return productCategory;
            }
        }

        return null;
    }

    // Getters and Setters
    public List<ProductCategory> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(List<ProductCategory> productCategories) {
        this.productCategories = productCategories;
    }

    public void addProductCategory(int categoryId, String name, double price) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.price = price;
        productCategory.categoryName = name;
        productCategory.categoryId = categoryId;
        productCategories.add(productCategory);

    }

    public void addProduct(Product product, int categoryId) {
        ProductCategory catObj = null;
        for (ProductCategory category:productCategories){
            if (category.categoryId == categoryId){
                catObj = category;
            }
        }

        if (catObj!=null){
            catObj.addProduct(product);
        }
    }
}
