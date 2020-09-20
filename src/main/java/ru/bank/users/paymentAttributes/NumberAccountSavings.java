package ru.bank.users.paymentAttributes;

public class NumberAccountSavings extends NumberAccount {
    private String numberAccount;
    private int amountAccount;
    private String currencyMoney;

    public NumberAccountSavings(String numberAccount, int amountAccount, String currencyMoney) {
        super(numberAccount, amountAccount, currencyMoney);
    }

    @Override
    public String getNumberAccount() {
        return super.getNumberAccount();
    }

    @Override
    public int getAmountAccount() {
        return super.getAmountAccount();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}