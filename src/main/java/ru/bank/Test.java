package ru.bank;

import ru.bank.exceptionPaymentAttributes.ExceptionNumberMobilePhone;
import ru.bank.paymentAttributes.NumberMobilePhone;

public class Test {
    public static void main(String[] args) throws ExceptionNumberMobilePhone {
        NumberMobilePhone numb = new NumberMobilePhone("89001001010l");
        System.out.println(numb.checkNumber(numb.getNumberMobilePhone()));
    }
}
