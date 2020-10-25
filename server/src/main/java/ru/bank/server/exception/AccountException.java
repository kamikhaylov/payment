package ru.bank.server.exception;

public class AccountException extends RuntimeException {
    private String numberAccount;

    public AccountException(String message, String numberPhone) {
        super(message);
        this.numberAccount = numberPhone;
    }

    public AccountException() {
    }

    public AccountException(String message) {
        super(message);
    }

    public AccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountException(Throwable cause) {
        super(cause);
    }

    public AccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getNumberAccount() {
        return numberAccount;
    }
}