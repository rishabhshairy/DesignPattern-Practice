package com.rshairy.lldQuestions.VendingMachine;

import com.rshairy.lldQuestions.VendingMachine.enums.Coin;
import com.rshairy.lldQuestions.VendingMachine.enums.ItemType;
import com.rshairy.lldQuestions.VendingMachine.model.Item;
import com.rshairy.lldQuestions.VendingMachine.model.ItemShelf;
import com.rshairy.lldQuestions.VendingMachine.vendingStates.State;

public class VendProducts {
    public static void main(String[] args) {

        // initialize machine
        VendingMachine vendingMachine = new VendingMachine();

        try {
            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("clicking on InsertCoinButton");
            System.out.println("|");


            State currentMachineState = vendingMachine.getState();
            currentMachineState.clickOnInsertCoinButton(vendingMachine);  // this will change the state

            currentMachineState = vendingMachine.getState();
            currentMachineState.insertCoin(vendingMachine, Coin.NICKEL);
            currentMachineState.insertCoin(vendingMachine, Coin.QUARTER);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");
            currentMachineState.clickOnStartProductSelectionButton(vendingMachine);

            currentMachineState = vendingMachine.getState();
            currentMachineState.chooseProduct(vendingMachine, 102);
            displayInventory(vendingMachine);

        } catch (Exception e) {
            System.err.println(e.getMessage());
//            displayInventory(vendingMachine);
        }
    }


    private static void fillUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getItemShelves();
        // now fill items to each slot

        for (int i = 0; i < slots.length; i++) {
            Item newItem = new Item();

            if (i >= 0 && i < 3) {
                newItem.setItemType(ItemType.COKE);
                newItem.setPrice(12);
            } else if (i >= 3 && i < 5) {
                newItem.setItemType(ItemType.PEPSI);
                newItem.setPrice(9);
            } else if (i >= 5 && i < 7) {
                newItem.setItemType(ItemType.JUICE);
                newItem.setPrice(13);
            } else if (i >= 7 && i < 10) {
                newItem.setItemType(ItemType.SODA);
                newItem.setPrice(7);
            }
            slots[i].setItem(newItem);
            slots[i].setSold(false);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getItemShelves();
        for (int i = 0; i < slots.length; i++) {

            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getItemType().name() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].isSold());

        }
    }
}
