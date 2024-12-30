package com.rshairy.lldQuestions.Splitwise.user;

import com.rshairy.lldQuestions.Splitwise.balanceSheet.UserExpenseBalanceSheet;

public class User {
    String userId;
    String name;
    UserExpenseBalanceSheet userBalanceSheet;

    public User(String id, String name) {
        this.userId = id;
        this.name = name;
        this.userBalanceSheet = new UserExpenseBalanceSheet();
    }

    public String getUserId() {
        return userId;
    }

    public User setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public UserExpenseBalanceSheet getUserBalanceSheet() {
        return userBalanceSheet;
    }

    public User setUserBalanceSheet(UserExpenseBalanceSheet userBalanceSheet) {
        this.userBalanceSheet = userBalanceSheet;
        return this;
    }
}
