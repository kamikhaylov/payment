package ru.bank.app.exception;

public class NumberPhoneException extends RuntimeException {
    private String numberPhone;

    public NumberPhoneException(String message, String numberPhone) {
        super(message);
        this.numberPhone = numberPhone;
    }

    public NumberPhoneException() {
    }

    public NumberPhoneException(String message) {
        super(message);
    }

    public NumberPhoneException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberPhoneException(Throwable cause) {
        super(cause);
    }

    public NumberPhoneException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getNumberPhone() {
        return numberPhone;
    }
}