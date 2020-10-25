package ru.bank.server.validation;

import ru.bank.server.exception.AccountException;
import ru.bank.server.users.paymentAttributes.Account;

import java.util.function.Supplier;

public class СheckLengthAccount<T extends Account> {

    public СheckLengthAccount checkLength(Supplier<T> sup) {
        if (sup.get().getAccount().length() != 16) {
            throw new AccountException("Неправильный формат счета, номер счет должен содержать 16 цифр " + sup.get().getAccount(), sup.get().getAccount());
        }
        return this;
    }
}