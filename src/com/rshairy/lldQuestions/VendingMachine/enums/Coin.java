package com.rshairy.lldQuestions.VendingMachine.enums;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    public int value;

    Coin(int i) {
        this.value = i;
    }
}
