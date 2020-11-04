package ru.bank.app.exception;

public class PhoneException extends RuntimeException {
    private String numberPhone;

    public PhoneException(String message, String numberPhone) {
        super(message);
        this.numberPhone = numberPhone;
    }

    public PhoneException() {
    }

    public PhoneException(String message) {
        super(message);
    }

    public PhoneException(String message, Throwable cause) {
        super(message, cause);
    }

    public PhoneException(Throwable cause) {
        super(cause);
    }

    public PhoneException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getNumberPhone() {
        return numberPhone;
    }
}