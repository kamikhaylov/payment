package ru.bank.server.validation;

import ru.bank.server.exception.AccountException;
import ru.bank.server.users.paymentAttributes.Account;

import java.util.function.Supplier;

public class CheckAllNumberAccount<T extends Account> {

    public CheckAllNumberAccount checkAllNumber(Supplier<T> sup) {
        for (int i = 0; i < sup.get().getAccount().length(); i++) {
            if (!Character.isDigit(sup.get().getAccount().charAt(i))) {
                throw new AccountException("Неправильный формат счета, номер счета должен только цифры " + sup.get().getAccount(), sup.get().getAccount());
            }
        }
        return this;
    }
}