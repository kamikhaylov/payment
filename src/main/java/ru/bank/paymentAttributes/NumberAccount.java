package ru.bank.paymentAttributes;

public class NumberAccount {
    private String numberAccount;
    private Long amountAccount;

    public NumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public NumberAccount(String numberAccount, Long amountAccount) {
        this.numberAccount = numberAccount;
        this.amountAccount = amountAccount;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public Long getAmountAccount() {
        return amountAccount;
    }
}