package ru.bank.exception.server;

public class PaymentIndetifierException extends RuntimeException {
    private String paymentIndetifier;

    public PaymentIndetifierException(String message, String paymentIndetifier) {
        super(message);
        this.paymentIndetifier = paymentIndetifier;
    }

    public PaymentIndetifierException() {
    }

    public PaymentIndetifierException(String message) {
        super(message);
    }

    public PaymentIndetifierException(String message, Throwable cause) {
        super(message, cause);
    }

    public PaymentIndetifierException(Throwable cause) {
        super(cause);
    }

    public PaymentIndetifierException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getPaymentIndetifier() {
        return paymentIndetifier;
    }
}