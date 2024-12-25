package com.rshairy.lldQuestions.ATM;

import com.rshairy.lldQuestions.ATM.model.Card;
import com.rshairy.lldQuestions.ATM.model.TransactionType;
import com.rshairy.lldQuestions.ATM.model.User;
import com.rshairy.lldQuestions.ATM.model.UserBankAccount;

public class ATMRoom {
    ATM atm;
    User user;

    public static void main(String[] args) {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();

        atmRoom.atm.printCurrentAtmStatus();
        atmRoom.atm.getAtmState().insertCard(atmRoom.atm, atmRoom.user.getCard());
        atmRoom.atm.getAtmState().authenticatePin(atmRoom.atm, atmRoom.user.getCard(), 121345);
        atmRoom.atm.getAtmState().selectOperation(atmRoom.atm, atmRoom.user.getCard(), TransactionType.WITHDRAW_CASH);
        atmRoom.atm.getAtmState().cashWithdrawal(atmRoom.atm, atmRoom.user.getCard(), 5600);
        atmRoom.atm.printCurrentAtmStatus();

    }

    private void initialize() {
        // create ATM
        atm = ATM.getATMObject();
        atm.setATMbalance(5500, 1, 5, 10);

        // create user
        this.user = createUser();
    }

    private User createUser() {
        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard() {
        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    private UserBankAccount createBankAccount() {
        UserBankAccount account = new UserBankAccount();
        account.setBalance(5000);
        return account;
    }
}
