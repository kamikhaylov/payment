package ru.bank.paymentAttributes;

public class NumberAccount {
    private String numberAccount;
    private int amountAccount;

    public NumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public NumberAccount(String numberAccount, int amountAccount) {
        this.numberAccount = numberAccount;
        this.amountAccount = amountAccount;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public int getAmountAccount() {
        return amountAccount;
    }
}