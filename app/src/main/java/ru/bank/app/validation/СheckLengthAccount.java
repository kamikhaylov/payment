package ru.bank.app.validation;

import ru.bank.app.exception.AccountException;
import ru.bank.users.paymentAttributes.Account;

import java.util.function.Supplier;

public class СheckLengthAccount<T extends Account> {

    public СheckLengthAccount checkLength(Supplier<T> sup) {
        if (sup.get().getAccount().length() != 16) {
            throw new AccountException("Неправильный формат счета, номер счет должен содержать 16 цифр " + sup.get().getAccount(), sup.get().getAccount());
        }
        return this;
    }
}