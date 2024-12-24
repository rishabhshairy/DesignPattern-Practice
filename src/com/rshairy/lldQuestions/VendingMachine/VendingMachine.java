package com.rshairy.lldQuestions.VendingMachine;

import com.rshairy.lldQuestions.VendingMachine.enums.Coin;
import com.rshairy.lldQuestions.VendingMachine.model.Inventory;
import com.rshairy.lldQuestions.VendingMachine.vendingStates.State;
import com.rshairy.lldQuestions.VendingMachine.vendingStates.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    State state;
    List<Coin> coins;
    Inventory inventory;

    public VendingMachine() {
        state = new IdleState();
        inventory = new Inventory(10);
        coins = new ArrayList<>();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
