package ru.bank.app.validation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.bank.app.exception.NumberPhoneException;

class NumberPhoneValidationTest {

    NumberPhoneValidation numberPhoneValidation;
    NumberPhoneValidation numberPhoneValidationCheckPrefix1;
    NumberPhoneValidation numberPhoneValidationCheckPrefix2;
    NumberPhoneValidation numberPhoneValidationCheckLength1;
    NumberPhoneValidation numberPhoneValidationCheckLength2;
    NumberPhoneValidation numberPhoneValidationCheckAllNumber;

    @BeforeEach
    void setUp() {
        numberPhoneValidation = new NumberPhoneValidation("+79001234567");
        numberPhoneValidationCheckPrefix1 = new NumberPhoneValidation("79001234567");
        numberPhoneValidationCheckPrefix2 = new NumberPhoneValidation("-79001234567");
        numberPhoneValidationCheckLength1 = new NumberPhoneValidation("+7900123456");
        numberPhoneValidationCheckLength2 = new NumberPhoneValidation("+790012345678");
        numberPhoneValidationCheckAllNumber = new NumberPhoneValidation("+7900wwwwww");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkPrefix() {
        try {
            numberPhoneValidation.checkPrefix();
            System.out.println("Проверка checkPrefix пройдена: " + numberPhoneValidation.getNumberPhone());
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
        try {
            numberPhoneValidationCheckPrefix1.checkPrefix();
            System.out.println("Проверка checkPrefix пройдена " + numberPhoneValidationCheckPrefix1.getNumberPhone());
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
        try {
            numberPhoneValidationCheckPrefix2.checkPrefix();
            System.out.println("Проверка checkPrefix пройдена " + numberPhoneValidationCheckPrefix2.getNumberPhone());
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
    }

    @Test
    void checkLength() {
        try {
            numberPhoneValidation.checkLength();
            System.out.println("Проверка checkLength пройдена: " + numberPhoneValidation.getNumberPhone());
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
        try {
            numberPhoneValidationCheckLength1.checkLength();
            System.out.println("Проверка checkLength пройдена: " + numberPhoneValidationCheckLength1.getNumberPhone());
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
        try {
            numberPhoneValidationCheckLength2.checkLength();
            System.out.println("Проверка checkLength пройдена: " + numberPhoneValidationCheckLength2.getNumberPhone());
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
    }

    @Test
    void checkAllNumber() {
        try {
            numberPhoneValidation.checkAllNumber();
            System.out.println("Проверка checkAllNumber пройдена: " + numberPhoneValidation.getNumberPhone());
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
        try {
            numberPhoneValidationCheckAllNumber.checkAllNumber();
            System.out.println("Проверка checkAllNumber пройдена: " + numberPhoneValidationCheckAllNumber.getNumberPhone());
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
    }
}