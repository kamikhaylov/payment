package ru.bank.app.exception;

public class NumberAccountException extends RuntimeException {
    private String numberAccount;

    public NumberAccountException(String message, String numberPhone) {
        super(message);
        this.numberAccount = numberPhone;
    }

    public NumberAccountException() {
    }

    public NumberAccountException(String message) {
        super(message);
    }

    public NumberAccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberAccountException(Throwable cause) {
        super(cause);
    }

    public NumberAccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getNumberAccount() {
        return numberAccount;
    }
}