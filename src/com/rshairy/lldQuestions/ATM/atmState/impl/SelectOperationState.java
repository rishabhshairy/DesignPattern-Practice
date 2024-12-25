package com.rshairy.lldQuestions.ATM.atmState.impl;

import com.rshairy.lldQuestions.ATM.ATM;
import com.rshairy.lldQuestions.ATM.atmState.AtmState;
import com.rshairy.lldQuestions.ATM.model.Card;
import com.rshairy.lldQuestions.ATM.model.TransactionType;

import java.util.Arrays;

public class SelectOperationState extends AtmState {

    public SelectOperationState() {
        System.out.println("--- Please Select Operations From Below Menu -----");
        showOperations();
    }

    private void showOperations() {
        Arrays.stream(TransactionType.values()).forEach(txn -> System.out.println(txn));
        System.out.println("--------------------");
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType txnType) {
        System.out.println("Selected Operation::" + txnType);

        switch (txnType) {
            case WITHDRAW_CASH:
                atm.setAtmState(new CashWithdrawalState());
                break;
            case CHECK_BALANCE:
                atm.setAtmState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid Option");
                exit(atm);
        }
    }

    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setAtmState(new IdleState());
        System.out.println("Thank you for using");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

}
