package ru.bank.app.validation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.bank.exception.app.NumberAccountException;
import ru.bank.users.paymentAttributes.NumberAccountIndividual;
import ru.bank.users.paymentAttributes.СurrencyMoney;

class NumberAccountValidationTest {
    NumberAccountValidation<NumberAccountIndividual> numberAccountValidation;
    NumberAccountIndividual numberAccount;

    @BeforeEach
    void setUp() {
        numberAccount = new NumberAccountIndividual("1111222233334444", 50000, СurrencyMoney.RUB.name());
        numberAccountValidation = new NumberAccountValidation<NumberAccountIndividual>(numberAccount);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkLength() {
        try {
            numberAccountValidation.checkLength();
            System.out.println("Проверка checkLength пройдена: " + numberAccountValidation.getNumberAccount());
        } catch (NumberAccountException e) {
            System.out.println(e);
            System.out.println(e.getNumberAccount());
        }
    }

    @Test
    void checkAllNumber() {
        try {
            numberAccountValidation.checkAllNumber();
            System.out.println("Проверка checkAllNumber пройдена: " + numberAccountValidation.getNumberAccount());
        } catch (NumberAccountException e) {
            System.out.println(e);
            System.out.println(e.getNumberAccount());
        }
    }
}