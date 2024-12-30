package com.rshairy.lldQuestions.Splitwise.controller;

import com.rshairy.lldQuestions.Splitwise.balanceSheet.Balance;
import com.rshairy.lldQuestions.Splitwise.balanceSheet.UserExpenseBalanceSheet;
import com.rshairy.lldQuestions.Splitwise.expense.split.Split;
import com.rshairy.lldQuestions.Splitwise.user.User;

import java.util.List;

public class BalanceSheetController {

    public void updateUserExpenseBalanceSheet(User paidByUser, List<Split> splitDetails, double expenseAmount) {
        UserExpenseBalanceSheet paidByUserExpenseBalanceSheet = paidByUser.getUserBalanceSheet();
        paidByUserExpenseBalanceSheet.setTotalPaymentDone(expenseAmount);

        for (Split split : splitDetails) {
            User userOwe = split.getUser();
            UserExpenseBalanceSheet oweUserBalaceSheet = userOwe.getUserBalanceSheet();
            double oweAmount = split.getSplitAmount();

            if (paidByUser.getUserId().equals(userOwe.getUserId())) {
                paidByUserExpenseBalanceSheet.setTotalExpense(paidByUserExpenseBalanceSheet.getTotalExpense() + oweAmount);
            } else {
                // update other user balance sheet owed amount
                paidByUserExpenseBalanceSheet.setTotalGetBack(paidByUserExpenseBalanceSheet.getTotalGetBack() + oweAmount);

                Balance userOweBalance;
                if(paidByUserExpenseBalanceSheet.getUserFriendBalance().containsKey(userOwe.getUserId())) {

                    userOweBalance = paidByUserExpenseBalanceSheet.getUserFriendBalance().get(userOwe.getUserId());
                }
                else {
                    userOweBalance = new Balance();
                    paidByUserExpenseBalanceSheet.getUserFriendBalance().put(userOwe.getUserId(), userOweBalance);
                }

                userOweBalance.setAmountGetBack(userOweBalance.getAmountGetBack() + oweAmount);


                //update the balance sheet of owe user
                oweUserBalaceSheet.setTotalOwe(oweUserBalaceSheet.getTotalOwe() + oweAmount);
                oweUserBalaceSheet.setTotalExpense(oweUserBalaceSheet.getTotalExpense() + oweAmount);

                Balance userPaidBalance;
                if(oweUserBalaceSheet.getUserFriendBalance().containsKey(paidByUser.getUserId())){
                    userPaidBalance = oweUserBalaceSheet.getUserFriendBalance().get(paidByUser.getUserId());
                }
                else{
                    userPaidBalance = new Balance();
                    oweUserBalaceSheet.getUserFriendBalance().put(paidByUser.getUserId(), userPaidBalance);
                }
                userPaidBalance.setAmountOwe(userPaidBalance.getAmountOwe() + oweAmount);

            }
        }

    }

    public void showBalanceSheetOfUser(User user) {

    }
}
