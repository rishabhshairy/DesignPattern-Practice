package com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel;

import java.util.Map;

public class Warehouse {
    Address address;
    Inventory inventory;

    public void removeItemFromInventory(Map<Integer, Integer> productCategoryAndCountMap){

        //it will update the items in the inventory based upon product category.
        inventory.removeItems(productCategoryAndCountMap);
    }


    public void addItemToInventory(Map<Integer,Integer> productCategoryAndCountMap) {

    }
}
