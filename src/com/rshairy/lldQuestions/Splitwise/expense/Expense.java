package com.rshairy.lldQuestions.Splitwise.expense;

import com.rshairy.lldQuestions.Splitwise.expense.split.Split;
import com.rshairy.lldQuestions.Splitwise.expense.split.SplitType;
import com.rshairy.lldQuestions.Splitwise.user.User;

import java.util.List;

public class Expense {
    String expenseId;
    String description;
    Double expenseAmount;
    SplitType splitType;
    User paidByUser;
    List<Split> splits;

    public Expense(String id, String description, Double expenseAmount, SplitType splitType, User paidByUser, List<Split> splits) {
        this.expenseId = id;
        this.description = description;
        this.expenseAmount = expenseAmount;
        this.splitType = splitType;
        this.paidByUser = paidByUser;
        this.splits = splits;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public Expense setExpenseId(String expenseId) {
        this.expenseId = expenseId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Expense setDescription(String description) {
        this.description = description;
        return this;
    }

    public Double getExpenseAmount() {
        return expenseAmount;
    }

    public Expense setExpenseAmount(Double expenseAmount) {
        this.expenseAmount = expenseAmount;
        return this;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public Expense setSplitType(SplitType splitType) {
        this.splitType = splitType;
        return this;
    }

    public User getPaidByUser() {
        return paidByUser;
    }

    public Expense setPaidByUser(User paidByUser) {
        this.paidByUser = paidByUser;
        return this;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public Expense setSplits(List<Split> splits) {
        this.splits = splits;
        return this;
    }
}
