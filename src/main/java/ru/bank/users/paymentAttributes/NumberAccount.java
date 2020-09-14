package ru.bank.paymentAttributes;

public class NumberAccount {
    private String numberAccount;
    private int amountAccount;
    private String currencyMoney;

    public NumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public NumberAccount(String numberAccount, int amountAccount, String currencyMoney) {
        this.numberAccount = numberAccount;
        this.amountAccount = amountAccount;
        this.currencyMoney = currencyMoney;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public int getAmountAccount() {
        return amountAccount;
    }
}