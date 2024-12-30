package com.rshairy.lldQuestions.Splitwise.balanceSheet;

public class Balance {
    double amountOwe;
    double amountGetBack;

    public double getAmountOwe() {
        return amountOwe;
    }

    public Balance setAmountOwe(double amountOwe) {
        this.amountOwe = amountOwe;
        return this;
    }

    public double getAmountGetBack() {
        return amountGetBack;
    }

    public Balance setAmountGetBack(double amountGetBack) {
        this.amountGetBack = amountGetBack;
        return this;
    }
}
