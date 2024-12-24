package com.rshairy.lldQuestions.VendingMachine.vendingStates.impl;

import com.rshairy.lldQuestions.VendingMachine.VendingMachine;
import com.rshairy.lldQuestions.VendingMachine.enums.Coin;
import com.rshairy.lldQuestions.VendingMachine.model.Item;
import com.rshairy.lldQuestions.VendingMachine.vendingStates.State;

import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState() {
        System.out.println("------------Currently Vending Machine in HasMoneyState-------------");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setState(new SelectProductState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Coins Accepted");
        machine.getCoins().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you need to click on start product selection button first");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in hasMoney state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed in hasMoney state");
    }


    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned Full Amount back in Coin Dispensing Tray");
        List<Coin> coinsToRefund = machine.getCoins();
        machine.setState(new IdleState(machine));
        return coinsToRefund;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("you can not update inventory in hasMoney  state");
    }

}
