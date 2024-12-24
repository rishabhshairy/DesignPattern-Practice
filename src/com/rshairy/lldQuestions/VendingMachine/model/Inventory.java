package com.rshairy.lldQuestions.VendingMachine.model;

public class Inventory {
    ItemShelf[] itemShelves;

    public Inventory(int itemCount) {
        itemShelves = new ItemShelf[itemCount];
        initializeEmptyInventory();
    }

    private void initializeEmptyInventory() {
        int startCode = 101;
        for (int i = 0; i < itemShelves.length; i++) {
            // just creating spaces now
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSold(true);

            itemShelves[i] = space;
            startCode++;
        }
    }


    public ItemShelf[] getItemShelves() {
        return itemShelves;
    }

    public void setItemShelves(ItemShelf[] itemShelves) {
        this.itemShelves = itemShelves;
    }

    public void addItem(Item item, int codeNumber) {
    }

    public Item getItem(int codeNumber) throws Exception {
        Item selectedItem = null;

        for (ItemShelf shelf : itemShelves) {
            if (shelf.getCode() == codeNumber) {
                if (shelf.isSold()) {
                    throw new Exception("item Already sold");
                } else {
                    return shelf.getItem();
                }
            }
        }

        throw new Exception("Invalid Item Code");
    }

    public void updateSoldOutItems(int codeNumber) {
        for (ItemShelf shelf : itemShelves) {
            if (shelf.getCode() == codeNumber) {
                shelf.setSold(true);
            }
        }
    }
}
