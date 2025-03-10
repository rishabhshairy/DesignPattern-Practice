package com.rshairy.lldQuestions.VendingMachine.vendingStates.impl;

import com.rshairy.lldQuestions.VendingMachine.VendingMachine;
import com.rshairy.lldQuestions.VendingMachine.enums.Coin;
import com.rshairy.lldQuestions.VendingMachine.model.Item;
import com.rshairy.lldQuestions.VendingMachine.vendingStates.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState() {
        System.out.println("---------Currently Vending Machine is in Idle State---------");
    }

    public IdleState(VendingMachine vendingMachine) {
        System.out.println("---------Currently Vending Machine is in Idle State---------");
        vendingMachine.setCoins(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        System.out.println("Pressed on Insert Coin Button... Now you can insert coins");
        machine.setState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on insert coin button");

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you can not choose Product in idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("you can not get refunded in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed idle state");
    }


    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }
}
