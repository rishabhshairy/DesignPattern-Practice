package com.rshairy.lldQuestions.VendingMachine.model;

import com.rshairy.lldQuestions.VendingMachine.enums.ItemType;

public class Item {
    ItemType itemType;
    int price;

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
