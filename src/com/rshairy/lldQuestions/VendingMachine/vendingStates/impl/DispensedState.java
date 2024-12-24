package com.rshairy.lldQuestions.VendingMachine.vendingStates.impl;

import com.rshairy.lldQuestions.VendingMachine.VendingMachine;
import com.rshairy.lldQuestions.VendingMachine.enums.Coin;
import com.rshairy.lldQuestions.VendingMachine.model.Item;
import com.rshairy.lldQuestions.VendingMachine.vendingStates.State;

import java.util.List;

public class DispensedState implements State {

    public DispensedState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("----------------Currently Vending Machine is in DispensedState--------------");
        this.dispenseProduct(machine, codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("insert coin button can not clicked on Dispense state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("product selection buttion can not be clicked in Dispense state");

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("coin can not be inserted in Dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be choosen in Dispense state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("change can not returned in Dispense state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("refund can not be happen in Dispense state");
    }


    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("|||||||--- Product is dispensed in Dispensing tray ---||||||");
        System.out.println();
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItems(codeNumber);
        machine.setState(new IdleState(machine));
        return item;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("inventory can not be updated in Dispense state");
    }

}
