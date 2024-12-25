package com.rshairy.lldQuestions.ATM.model;

public class Card {
    int cardNumber;
    int cvvNumber;
    String expiryDate;
    String holderName;
    static int PIN_NUMBER = 121345;
    UserBankAccount bankAccount;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvvNumber() {
        return cvvNumber;
    }

    public void setCvvNumber(int cvvNumber) {
        this.cvvNumber = cvvNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public UserBankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(UserBankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public boolean isPinCorrect(int pin) {
        return pin == PIN_NUMBER;
    }

    public void deductBalance(int withdrawAmount) {
        this.bankAccount.setBalance(this.bankAccount.getBalance() - withdrawAmount);
    }
}
