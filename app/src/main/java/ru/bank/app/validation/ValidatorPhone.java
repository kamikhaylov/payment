package ru.bank.app.validation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.bank.app.exception.PhoneException;

@AllArgsConstructor
@Getter
public class ValidatorPhone {
    private String numberPhone;

    public ValidatorPhone checkPrefix() {
        if (!numberPhone.startsWith("+7")) {
            throw new PhoneException("Неправильный формат номера, номер должен начинаться с +7 " + numberPhone, numberPhone);
        }
        return this;
    }

    public ValidatorPhone checkLength() {
        if (numberPhone.length() != 12) {
            throw new PhoneException("Неправильный формат номера, номер должен содержать 12 символов " + numberPhone, numberPhone);
        }
        return this;
    }

    public ValidatorPhone checkAllNumber() {
        String numberSymbol = numberPhone.substring(2);
        for (int i = 0; i < numberSymbol.length(); i++) {
            if (!Character.isDigit(numberSymbol.charAt(i))) {
                throw new PhoneException("Неправильный формат номера, после префикса +7 - номер должен содержать только цифры " + numberPhone, numberPhone);
            }
        }
        return this;
    }
}
