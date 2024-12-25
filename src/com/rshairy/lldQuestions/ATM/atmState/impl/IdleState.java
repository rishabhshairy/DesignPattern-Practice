package com.rshairy.lldQuestions.ATM.atmState.impl;

import com.rshairy.lldQuestions.ATM.ATM;
import com.rshairy.lldQuestions.ATM.atmState.AtmState;
import com.rshairy.lldQuestions.ATM.model.Card;

public class IdleState extends AtmState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setAtmState(new HasCardState());
    }
}
