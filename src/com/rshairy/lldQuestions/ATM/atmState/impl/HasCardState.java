package com.rshairy.lldQuestions.ATM.atmState.impl;

import com.rshairy.lldQuestions.ATM.ATM;
import com.rshairy.lldQuestions.ATM.atmState.AtmState;
import com.rshairy.lldQuestions.ATM.model.Card;

public class HasCardState extends AtmState {

    public HasCardState() {
        System.out.println("Please enter pin number");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {
        System.out.println("Please Wait while we authenticate the Card");

        if (card.isPinCorrect(pin)) {
            System.out.println("Authentication Successful");
            atm.setAtmState(new SelectOperationState());
        } else {
            System.out.println("!!!! Invalid Pin !!!!");
            exit(atm);
        }
    }

    @Override
    public void returnCard() {
        System.out.println("Please Collect Your Card");
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setAtmState(new IdleState());
        System.out.println("Thank You For Using");
    }
}
