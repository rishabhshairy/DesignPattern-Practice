package com.rshairy.lldQuestions.Splitwise.service;

import com.rshairy.lldQuestions.Splitwise.expense.split.Split;

import java.util.List;

public interface ExpenseSplit {
    void validate(List<Split> splitDetails, double expenseAmount);
}
