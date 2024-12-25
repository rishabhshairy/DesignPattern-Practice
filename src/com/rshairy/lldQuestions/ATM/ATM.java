package com.rshairy.lldQuestions.ATM;

import com.rshairy.lldQuestions.ATM.atmState.AtmState;
import com.rshairy.lldQuestions.ATM.atmState.impl.IdleState;

public class ATM {

    private static ATM atmObject = new ATM(); // singleton initialization

    AtmState atmState;
    int balance;
    int twoThousandNotes;
    int fiveHundredNotes;
    int oneHundredNotes;

    private ATM() {

    }

    // this will return singleton instance of ATM Class
    public static ATM getATMObject() {
        atmObject.setAtmState(new IdleState());
        return atmObject;
    }

    public void printCurrentAtmStatus() {
        System.out.println("----- Current ATM Status ------");
        System.out.println("Balance: " + balance);
        System.out.println("2kNotes: " + twoThousandNotes);
        System.out.println("500Notes: " + fiveHundredNotes);
        System.out.println("100Notes: " + oneHundredNotes);
        System.out.println("----- Current ATM Status ------");

    }

    public void setATMbalance(int balance, int twoThousandNotes, int fiveHundredNotes, int oneHundredNotes) {
        this.balance = balance;
        this.twoThousandNotes = twoThousandNotes;
        this.fiveHundredNotes = fiveHundredNotes;
        this.oneHundredNotes = oneHundredNotes;
    }

    public AtmState getAtmState() {
        return atmState;
    }

    public void setAtmState(AtmState atmState) {
        this.atmState = atmState;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTwoThousandNotes() {
        return twoThousandNotes;
    }

    public void setTwoThousandNotes(int twoThousandNotes) {
        this.twoThousandNotes = twoThousandNotes;
    }

    public int getFiveHundredNotes() {
        return fiveHundredNotes;
    }

    public void setFiveHundredNotes(int fiveHundredNotes) {
        this.fiveHundredNotes = fiveHundredNotes;
    }

    public int getOneHundredNotes() {
        return oneHundredNotes;
    }

    public void setOneHundredNotes(int oneHundredNotes) {
        this.oneHundredNotes = oneHundredNotes;
    }


    public void deductAtmBalance(int withdrawAmount) {
        atmObject.setBalance(atmObject.getBalance() - withdrawAmount);

    }

    public void deductTwoThousandNotes(int requireNotes) {
        atmObject.setTwoThousandNotes(atmObject.getTwoThousandNotes() - requireNotes);
    }

    public void deductFiveHundredNotes(int requiredNotes) {
        atmObject.setFiveHundredNotes(atmObject.getFiveHundredNotes() - requiredNotes);
    }

    public void deductOneHundredNotes(int required) {
        atmObject.setOneHundredNotes(atmObject.getOneHundredNotes() - required);
    }
}
