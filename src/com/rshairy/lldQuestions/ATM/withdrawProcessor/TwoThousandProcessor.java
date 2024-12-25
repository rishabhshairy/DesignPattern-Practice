package com.rshairy.lldQuestions.ATM.withdrawProcessor;

import com.rshairy.lldQuestions.ATM.ATM;

public class TwoThousandProcessor extends CashWithdrawProcessor {

    private final static int NOTE = 2000;

    public TwoThousandProcessor(CashWithdrawProcessor next) {
        super(next);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int requireNotes = remainingAmount / NOTE;
        int balanceAmount = remainingAmount % NOTE;

        if (requireNotes <= atm.getTwoThousandNotes()) {
            atm.deductTwoThousandNotes(requireNotes);
        } else if (requireNotes > atm.getTwoThousandNotes()) {
            balanceAmount = balanceAmount + (requireNotes - atm.getTwoThousandNotes()) * 2000;
            atm.deductTwoThousandNotes(atm.getTwoThousandNotes());
            System.out.println(balanceAmount);
        }

        if (balanceAmount != 0) {
            super.withdraw(atm, balanceAmount);
        }
    }
}
