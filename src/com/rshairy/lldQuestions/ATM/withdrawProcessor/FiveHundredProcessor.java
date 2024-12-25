package com.rshairy.lldQuestions.ATM.withdrawProcessor;

import com.rshairy.lldQuestions.ATM.ATM;

public class FiveHundredProcessor extends CashWithdrawProcessor {
    public FiveHundredProcessor(CashWithdrawProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {

        int required = remainingAmount / 500;
        int balance = remainingAmount % 500;

        if (required <= atm.getFiveHundredNotes()) {
            atm.deductFiveHundredNotes(required);
        } else if (required > atm.getFiveHundredNotes()) {
            balance = balance + (required - atm.getFiveHundredNotes()) * 500;
            atm.deductFiveHundredNotes(atm.getFiveHundredNotes());
            System.out.println(balance);
        }

        if (balance != 0) {
            super.withdraw(atm, balance);
        }
    }

}
