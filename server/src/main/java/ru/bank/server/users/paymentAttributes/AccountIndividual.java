package ru.bank.server.users.paymentAttributes;

public class AccountIndividual extends Account {
    private String account;
    private int amount;
    private Сurrency сurrency;

    public AccountIndividual(String account, int amount, Сurrency сurrency) {
        super(account, amount, сurrency);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getAccount() {
        return super.getAccount();
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }
}