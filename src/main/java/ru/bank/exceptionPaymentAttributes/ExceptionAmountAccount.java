package ru.bank.exceptionPaymentAttributes;

public class ExceptionAmountAccount extends Exception {
    private long checkAmountAccount;

    public ExceptionAmountAccount(String message, long checkAmountAccount) {
        super(message);
        this.checkAmountAccount = checkAmountAccount;
    }

    public long getCheckAmountAccount() {
        return checkAmountAccount;
    }
}