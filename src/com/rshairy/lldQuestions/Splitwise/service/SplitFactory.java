package com.rshairy.lldQuestions.Splitwise.service;

import com.rshairy.lldQuestions.Splitwise.expense.split.SplitType;
import com.rshairy.lldQuestions.Splitwise.service.impl.EqualExpenseSplit;
import com.rshairy.lldQuestions.Splitwise.service.impl.PercentageExpenseSplit;
import com.rshairy.lldQuestions.Splitwise.service.impl.UnEqualExpenseSplit;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(SplitType splitType) {
        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnEqualExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}
