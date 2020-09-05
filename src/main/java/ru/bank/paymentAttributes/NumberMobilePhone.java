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

        String checkStatus = "";
        try {
            Long number = Long.parseLong(numberMobilePhone);
        } catch (Exception e) {
            checkStatus = "Неправильный формат номера: " + numberMobilePhone +
                    ", номер должен содержать только цифры ";
            System.out.println(e);
        }
        if (numberMobilePhone.length() != 11) {
            throw new ExceptionNumberMobilePhone("Неправильный формат номера, номер должен содержать 11 цифр", numberMobilePhone);
        }
        return checkStatus;
    }
}