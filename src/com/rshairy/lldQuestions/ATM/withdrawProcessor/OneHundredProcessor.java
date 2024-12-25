package com.rshairy.lldQuestions.ATM.withdrawProcessor;

import com.rshairy.lldQuestions.ATM.ATM;

public class OneHundredProcessor extends CashWithdrawProcessor {
    public OneHundredProcessor(CashWithdrawProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {

        int required = remainingAmount / 100;
        int balance = remainingAmount % 100;

        if (required <= atm.getOneHundredNotes()) {
            atm.deductOneHundredNotes(required);
        } else if (required > atm.getOneHundredNotes()) {
            balance = balance + (required - atm.getOneHundredNotes()) * 100;
            atm.deductOneHundredNotes(atm.getOneHundredNotes());

        }

        if (balance != 0) {
            System.out.println("Something went wrong");
        }
    }

}
