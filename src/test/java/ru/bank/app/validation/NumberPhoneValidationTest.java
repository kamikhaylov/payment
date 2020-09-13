package ru.bank.app.validation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.bank.exception.app.NumberPhoneException;

class NumberPhoneValidationTest {

    NumberPhoneValidation numberPhoneValidationCheckPrefix;


    @BeforeEach
    void setUp() {
        numberPhoneValidationCheckPrefix = new NumberPhoneValidation("79001234567");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkPrefix() {
        try {
            numberPhoneValidationCheckPrefix.checkPrefix();
            System.out.println("Проверка checkPrefix пройдена");
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
    }

    @Test
    void checkLength() {
        try {
            numberPhoneValidationCheckPrefix.checkLength();
            System.out.println("Проверка checkLength пройдена");
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
    }

    @Test
    void checkAllNumber() {
        try {
            numberPhoneValidationCheckPrefix.checkAllNumber();
            System.out.println("Проверка checkAllNumber пройдена");
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
    }
}