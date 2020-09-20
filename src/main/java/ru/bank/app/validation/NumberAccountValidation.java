package ru.bank.app.validation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.bank.exception.app.NumberAccountException;
import ru.bank.users.paymentAttributes.NumberAccount;

@AllArgsConstructor
@Getter
public class NumberAccountValidation<T extends NumberAccount> {
    private T numberAccount;

    public NumberAccountValidation checkLength() {
        if (numberAccount.getNumberAccount().length() != 16) {
            throw new NumberAccountException("Неправильный формат счета, номер счет должен содержать 16 цифр " + numberAccount.getNumberAccount(), numberAccount.getNumberAccount());
        }
        return this;
    }

    public NumberAccountValidation checkAllNumber() {
        for (int i = 0; i < numberAccount.getNumberAccount().length(); i++) {
            if (!Character.isDigit(numberAccount.getNumberAccount().charAt(i))) {
                throw new NumberAccountException("Неправильный формат счета, номер счета должен только цифры " + numberAccount.getNumberAccount(), numberAccount.getNumberAccount());
            }
        }
        return this;
    }
}
