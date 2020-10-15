package ru.bank.common.users.paymentAttributes;

public class AccountSavings extends Account {
    private String account;
    private int amount;
    private Сurrency сurrency;

    public AccountSavings(String account, int amount, Сurrency сurrency) {
        super(account, amount, сurrency);
    }

    @Override
    public String getAccount() {
        return super.getAccount();
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}