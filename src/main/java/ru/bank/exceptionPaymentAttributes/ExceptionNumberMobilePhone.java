package ru.bank.exceptionPaymentAttributes;

public class ExceptionNumberMobilePhone extends Exception {
    private String checkNumber;

    public ExceptionNumberMobilePhone(String message, String checkNumber) {
        super(message);
        this.checkNumber = checkNumber;
    }
 
    public String getCheckNumber() {
        return checkNumber;
    }
}