package com.rshairy.lldQuestions.Splitwise.controller;

import com.rshairy.lldQuestions.Splitwise.expense.Expense;
import com.rshairy.lldQuestions.Splitwise.expense.split.Split;
import com.rshairy.lldQuestions.Splitwise.expense.split.SplitType;
import com.rshairy.lldQuestions.Splitwise.service.ExpenseSplit;
import com.rshairy.lldQuestions.Splitwise.service.SplitFactory;
import com.rshairy.lldQuestions.Splitwise.user.User;

import java.util.List;

public class ExpenseController {
    BalanceSheetController balanceSheetController;

    public ExpenseController(BalanceSheetController balanceSheetController) {
        this.balanceSheetController = balanceSheetController;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, SplitType splitType, User paidByUser) {
        // First get the object of split-type
        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validate(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, description, expenseAmount, splitType, paidByUser, splitDetails);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);
        return expense;
    }
}
