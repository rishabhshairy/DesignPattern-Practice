package com.rshairy.lldQuestions.Splitwise.balanceSheet;

import com.rshairy.lldQuestions.Splitwise.user.User;

import java.util.HashMap;
import java.util.Map;

public class UserExpenseBalanceSheet {
    Map<String, Balance> userFriendBalance;
    double totalExpense;
    double totalPaymentDone;
    double totalOwe;
    double totalGetBack;

    public UserExpenseBalanceSheet() {
        userFriendBalance = new HashMap<>();
        this.totalExpense = 0;
        this.totalOwe = 0;
        this.totalGetBack = 0;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public double getTotalPaymentDone() {
        return totalPaymentDone;
    }

    public void setTotalPaymentDone(double totalPaymentDone) {
        this.totalPaymentDone = totalPaymentDone;
    }

    public double getTotalOwe() {
        return totalOwe;
    }

    public void setTotalOwe(double totalOwe) {
        this.totalOwe = totalOwe;
    }

    public double getTotalGetBack() {
        return totalGetBack;
    }

    public void setTotalGetBack(double totalGetBack) {
        this.totalGetBack = totalGetBack;
    }

    public Map<String, Balance> getUserFriendBalance() {
        return userFriendBalance;
    }

    public void setUserFriendBalance(Map<String, Balance> userFriendBalance) {
        this.userFriendBalance = userFriendBalance;
    }
}
