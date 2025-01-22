package com.rshairy.lldQuestions.InventoryOrderManagement.user;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {
    Map<Integer, Integer> prodCatIdVsCountMap;

    public Cart() {
        this.prodCatIdVsCountMap = new LinkedHashMap<>();
    }

    public void addItem(int productCategoryId, int count) {
        prodCatIdVsCountMap.put(productCategoryId,
                prodCatIdVsCountMap.getOrDefault(productCategoryId, 0) + 1);
    }

    public Map<Integer, Integer> viewCart() {
        return prodCatIdVsCountMap;
    }

    public void emptyCart() {
        prodCatIdVsCountMap = new LinkedHashMap<>();
    }

    public void removeItem(int productCategoryId, int count) {
        if (prodCatIdVsCountMap.containsKey(productCategoryId))
        {
            int noOfItemsInCart = prodCatIdVsCountMap.get(productCategoryId);
            if (count - noOfItemsInCart == 0) {
                prodCatIdVsCountMap.remove(productCategoryId);
            } else {
                prodCatIdVsCountMap.put(productCategoryId, noOfItemsInCart - count);
            }
        }

    }
}
