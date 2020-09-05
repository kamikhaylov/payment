package ru.bank.pay;

import ru.bank.exceptionPaymentAttributes.ExceptionNumberMobilePhone;

public interface Pay {
    void pay() throws ExceptionNumberMobilePhone;
}