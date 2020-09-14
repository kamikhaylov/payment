package ru.bank.app.validation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.bank.exception.app.NumberPhoneException;

class NumberPhoneValidationTest {

    NumberPhoneValidation numberPhoneValidationCheckPrefix1;
    NumberPhoneValidation numberPhoneValidationCheckPrefix2;
    NumberPhoneValidation numberPhoneValidationCheckPrefix3;
    NumberPhoneValidation numberPhoneValidationCheckLength1;
    NumberPhoneValidation numberPhoneValidationCheckLength2;
    NumberPhoneValidation numberPhoneValidationCheckLength3;
    NumberPhoneValidation numberPhoneValidationCheckAllNumber1;
    NumberPhoneValidation numberPhoneValidationCheckAllNumber2;


    @BeforeEach
    void setUp() {
        numberPhoneValidationCheckPrefix1 = new NumberPhoneValidation("+79001234567");
        numberPhoneValidationCheckPrefix2 = new NumberPhoneValidation("79001234567");
        numberPhoneValidationCheckPrefix3 = new NumberPhoneValidation("-79001234567");
        numberPhoneValidationCheckLength1 = new NumberPhoneValidation("+79001234567");
        numberPhoneValidationCheckLength2 = new NumberPhoneValidation("+7900123456");
        numberPhoneValidationCheckLength3 = new NumberPhoneValidation("+790012345678");
        numberPhoneValidationCheckAllNumber1 = new NumberPhoneValidation("+79001234567");
        numberPhoneValidationCheckAllNumber2 = new NumberPhoneValidation("+7900wwwwww");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkPrefix() {
        try {
            numberPhoneValidationCheckPrefix1.checkPrefix();
            System.out.println("Проверка checkPrefix пройдена: " + numberPhoneValidationCheckPrefix1.getNumberPhone());
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
        try {
            numberPhoneValidationCheckPrefix2.checkPrefix();
            System.out.println("Проверка checkPrefix пройдена");
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
        try {
            numberPhoneValidationCheckPrefix3.checkPrefix();
            System.out.println("Проверка checkPrefix пройдена");
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
    }

    @Test
    void checkLength() {
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
        try {
            numberPhoneValidationCheckLength3.checkLength();
            System.out.println("Проверка checkLength пройдена: " + numberPhoneValidationCheckLength3.getNumberPhone());
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
    }

    @Test
    void checkAllNumber() {
        try {
            numberPhoneValidationCheckAllNumber1.checkAllNumber();
            System.out.println("Проверка checkAllNumber пройдена: " + numberPhoneValidationCheckAllNumber1.getNumberPhone());
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
        try {
            numberPhoneValidationCheckAllNumber2.checkAllNumber();
            System.out.println("Проверка checkAllNumber пройдена: " + numberPhoneValidationCheckAllNumber2.getNumberPhone());
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
    }
}