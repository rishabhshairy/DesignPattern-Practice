package com.rshairy.lldQuestions.ATM.withdrawProcessor;

import com.rshairy.lldQuestions.ATM.ATM;

public abstract class CashWithdrawProcessor {
    CashWithdrawProcessor nextProcessor;

    public CashWithdrawProcessor(CashWithdrawProcessor next) {
        this.nextProcessor = next;
    }

    public void withdraw(ATM atm, int remainingAmount) {
        if (nextProcessor != null) {
            nextProcessor.withdraw(atm, remainingAmount);
        }
    }
}
