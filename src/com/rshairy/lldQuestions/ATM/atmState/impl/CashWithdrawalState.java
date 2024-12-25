package com.rshairy.lldQuestions.ATM.atmState.impl;

import com.rshairy.lldQuestions.ATM.ATM;
import com.rshairy.lldQuestions.ATM.atmState.AtmState;
import com.rshairy.lldQuestions.ATM.model.Card;
import com.rshairy.lldQuestions.ATM.withdrawProcessor.CashWithdrawProcessor;
import com.rshairy.lldQuestions.ATM.withdrawProcessor.FiveHundredProcessor;
import com.rshairy.lldQuestions.ATM.withdrawProcessor.OneHundredProcessor;
import com.rshairy.lldQuestions.ATM.withdrawProcessor.TwoThousandProcessor;

public class CashWithdrawalState extends AtmState {

    public CashWithdrawalState() {
        System.out.println("Please Enter Withdraw Amount");
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount) {
        System.out.println("Amount to be withdrawn:: $" + withdrawAmount);
        // pre process data for error check

        // 1 check if atm have money
        // 2 check if bank have money

        if (withdrawAmount > atm.getBalance()) {
            System.out.println("Insufficient Funds in ATM");
            exit(atm);
        } else if (card.getBankAccount().getBalance() < withdrawAmount) {
            System.out.println("Insufficient Funds in Bank Account");
            exit(atm);
        } else {
            card.deductBalance(withdrawAmount);
            atm.deductAtmBalance(withdrawAmount);

            // using chain of responsibility to dispense cash
            CashWithdrawProcessor cashWithdrawProcessor = new TwoThousandProcessor(new FiveHundredProcessor(new OneHundredProcessor(null)));
            cashWithdrawProcessor.withdraw(atm, withdrawAmount);
            exit(atm);

        }
    }

    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setAtmState(new IdleState());
        System.out.println("Exiting System");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

}
