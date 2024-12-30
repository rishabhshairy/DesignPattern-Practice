package com.rshairy.lldQuestions.Splitwise.service.impl;

import com.rshairy.lldQuestions.Splitwise.expense.split.Split;
import com.rshairy.lldQuestions.Splitwise.service.ExpenseSplit;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {
    @Override
    public void validate(List<Split> splitDetails, double totalExpenseAmount) {
        double equalSplitAmount = totalExpenseAmount / splitDetails.size();
        for (Split split : splitDetails) {
            if (split.getSplitAmount() != equalSplitAmount) {
                try {
                    throw new Exception("Amounts not equally split");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
