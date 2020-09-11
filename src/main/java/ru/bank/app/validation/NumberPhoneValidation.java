package ru.bank.app.validation;

import lombok.AllArgsConstructor;
import ru.bank.exception.app.NumberPhoneException;

@AllArgsConstructor
public class NumberPhoneValidation {
    private String numberPhone;

    public NumberPhoneValidation checkPrefix() {
        if (!numberPhone.startsWith("+7")) {
            throw new NumberPhoneException("Неправильный формат номера, номер должен начинаться с +7 " + numberPhone, numberPhone);
        }
        return this;
    }

    public NumberPhoneValidation checkLength() {
        if (numberPhone.length() != 12) {
            throw new NumberPhoneException("Неправильный формат номера, номер должен содержать 12 символов " + numberPhone, numberPhone);
        }
        return this;
    }

    public NumberPhoneValidation checkAllNumber() {
        String numberSymbol = numberPhone.substring(2);
        for (int i = 0; i < numberSymbol.length(); i++) {
            if (!Character.isDigit(numberSymbol.charAt(i))) {
                throw new NumberPhoneException("Неправильный формат номера, после префикса +7 - номер должен содержать только цифры " + numberPhone, numberPhone);
            }
        }
        return this;
    }
}
