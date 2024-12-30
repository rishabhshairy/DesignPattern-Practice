package com.rshairy.lldQuestions.Splitwise.user;

import com.rshairy.lldQuestions.Splitwise.controller.BalanceSheetController;
import com.rshairy.lldQuestions.Splitwise.controller.ExpenseController;
import com.rshairy.lldQuestions.Splitwise.expense.Expense;
import com.rshairy.lldQuestions.Splitwise.expense.split.Split;
import com.rshairy.lldQuestions.Splitwise.expense.split.SplitType;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String groupId;
    String name;
    List<User> groupUsers;
    List<Expense> groupExpenses;
    ExpenseController expenseController;

    public Group() {
        this.groupExpenses = new ArrayList<>();
        this.groupUsers = new ArrayList<>();
        this.expenseController = new ExpenseController(new BalanceSheetController());
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getGroupUsers() {
        return groupUsers;
    }

    public void setGroupUsers(List<User> groupUsers) {
        this.groupUsers = groupUsers;
    }

    public List<Expense> getGroupExpenses() {
        return groupExpenses;
    }

    public void setGroupExpenses(List<Expense> groupExpenses) {
        this.groupExpenses = groupExpenses;
    }

    public Expense createGroupExpense(String expenseId, String description, double expenseAmount,
                                      List<Split> splitDetails, SplitType splitType, User paidByUser) {
        Expense groupExpense = this.expenseController.createExpense(expenseId, description, expenseAmount, splitDetails, splitType, paidByUser);
        this.groupExpenses.add(groupExpense);
        return groupExpense;
    }

    public void addMember(User member) {
        groupUsers.add(member);
    }
}
