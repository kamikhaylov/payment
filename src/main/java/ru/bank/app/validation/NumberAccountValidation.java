package ru.bank.app.validation;

import lombok.AllArgsConstructor;
import ru.bank.exception.app.NumberAccountException;

@AllArgsConstructor
public class NumberAccountValidation {
    private String numberAccount;

    public NumberAccountValidation checkLength() {
        if (numberAccount.length() != 16) {
            throw new NumberAccountException("Неправильный формат счета, номер счет должен содержать 16 цифр " + numberAccount, numberAccount);
        }
        return this;
    }

    public NumberAccountValidation checkAllNumber() {
        for (int i = 0; i < numberAccount.length(); i++) {
            if (Character.isDigit(numberAccount.charAt(i))) {
                throw new NumberAccountException("Неправильный формат счета, номер счета должен только цифры " + numberAccount, numberAccount);
            }
        }
        return this;
    }
}
