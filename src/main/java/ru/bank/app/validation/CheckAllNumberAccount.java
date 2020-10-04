package ru.bank.app.validation;

import ru.bank.app.exception.NumberAccountException;
import ru.bank.users.paymentAttributes.NumberAccount;

import java.util.function.Supplier;

public class CheckAllNumberAccount<T extends NumberAccount> {

    public CheckAllNumberAccount checkAllNumber(Supplier<T> sup) {
        for (int i = 0; i < sup.get().getNumberAccount().length(); i++) {
            if (!Character.isDigit(sup.get().getNumberAccount().charAt(i))) {
                throw new NumberAccountException("Неправильный формат счета, номер счета должен только цифры " + sup.get().getNumberAccount(), sup.get().getNumberAccount());
            }
        }
        return this;
    }
}