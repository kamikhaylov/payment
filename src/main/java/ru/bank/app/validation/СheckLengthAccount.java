package ru.bank.app.validation;

import ru.bank.app.exception.NumberAccountException;
import ru.bank.users.paymentAttributes.NumberAccount;

import java.util.function.Supplier;

public class СheckLengthAccount<T extends NumberAccount> {

    public СheckLengthAccount checkLength(Supplier<T> sup) {
        if (sup.get().getNumberAccount().length() != 16) {
            throw new NumberAccountException("Неправильный формат счета, номер счет должен содержать 16 цифр " + sup.get().getNumberAccount(), sup.get().getNumberAccount());
        }
        return this;
    }
}