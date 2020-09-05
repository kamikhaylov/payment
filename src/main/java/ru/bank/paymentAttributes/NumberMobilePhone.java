package ru.bank.paymentAttributes;

import ru.bank.exceptionPaymentAttributes.ExceptionNumberMobilePhone;

public class NumberMobilePhone {
    private String numberMobilePhone;

    public NumberMobilePhone(String numberMobilePhone) {
        this.numberMobilePhone = numberMobilePhone;
    }

    public String getNumberMobilePhone() {
        return numberMobilePhone;
    }

    public String checkNumber(String numberMobilePhone) throws ExceptionNumberMobilePhone {
        String numberCheck = numberMobilePhone;
        String checkStatus = "";

        try {
            Long number = Long.parseLong(numberCheck);
        } catch (Exception e) {
            throw new ExceptionNumberMobilePhone("Неправильный формат номера, номер должен содержать только цифры", numberCheck);
        }

        if (numberCheck.length() != 11) {
            throw new ExceptionNumberMobilePhone("Неправильный формат номера, номер должен содержать 11 цифр", numberCheck);
        }
        return checkStatus;
    }
}