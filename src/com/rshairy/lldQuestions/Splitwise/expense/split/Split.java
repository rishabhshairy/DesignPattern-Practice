package com.rshairy.lldQuestions.Splitwise.expense.split;

import com.rshairy.lldQuestions.Splitwise.user.User;

public class Split {
    User user;
    Double splitAmount;

    public Split(User user, double amount) {
        this.user = user;
        this.splitAmount = amount;
    }

    public User getUser() {
        return user;
    }

    public Split setUser(User user) {
        this.user = user;
        return this;
    }

    public Double getSplitAmount() {
        return splitAmount;
    }

    public Split setSplitAmount(Double splitAmount) {
        this.splitAmount = splitAmount;
        return this;
    }
}
