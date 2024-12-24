package com.rshairy.lldQuestions.VendingMachine.vendingStates.impl;

import com.rshairy.lldQuestions.VendingMachine.VendingMachine;
import com.rshairy.lldQuestions.VendingMachine.enums.Coin;
import com.rshairy.lldQuestions.VendingMachine.model.Item;
import com.rshairy.lldQuestions.VendingMachine.vendingStates.State;

import java.util.List;

public class SelectProductState implements State {

    public SelectProductState() {
        System.out.println("--------------Currently Vending Machine is in Select Product State---------------");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in selection state");
    }


    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        Item chosenItem = machine.getInventory().getItem(codeNumber);

        // now check if user has paid more then refund change
        int paidByUser = 0;

        for (Coin coin : machine.getCoins()) {
            paidByUser += coin.value;
        }

        if (paidByUser < chosenItem.getPrice()) {
            System.out.println("Insufficient Amount, Selected Product Price:: " + chosenItem.getPrice() + "/// Price Paid By you::" + paidByUser);
            refundFullMoney(machine);
            throw new Exception("Insufficient Funds");

        } else if (paidByUser >= chosenItem.getPrice()) {
            if (paidByUser > chosenItem.getPrice()) {
                getChange(paidByUser - chosenItem.getPrice());
            }
            // after refunding change move to dispensing state
            machine.setState(new DispensedState(machine, codeNumber));
        }

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Returned the change in Coin Dispensed Tray:: " + returnChangeMoney);
        return returnChangeMoney;
    }


    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Refunding Full Money in Coin Dispensing Tray");
        machine.setState(new IdleState(machine));
        return machine.getCoins();
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed Selection state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in Selection state");
    }

}
