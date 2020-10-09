package ru.bank.app.validation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.bank.app.exception.PhoneException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ValidatorPhoneTest {

    ValidatorPhone numberCheckPrefix1;
    ValidatorPhone numberCheckPrefix2;
    ValidatorPhone numberCheckLength1;
    ValidatorPhone numberCheckLength2;
    ValidatorPhone numberCheckAllNumber;

    @BeforeEach
    void setUp() {
        numberCheckPrefix1 = new ValidatorPhone("+89001234567");
        numberCheckPrefix2 = new ValidatorPhone("79001234567");
        numberCheckLength1 = new ValidatorPhone("+7900123456");
        numberCheckLength2 = new ValidatorPhone("+790012345678");
        numberCheckAllNumber = new ValidatorPhone("+7900wwwwww");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkPrefix() {
        assertThrows(PhoneException.class, () -> numberCheckPrefix1.checkPrefix());
        assertThrows(PhoneException.class, () -> numberCheckPrefix2.checkPrefix());
    }

    @Test
    void checkLength() {
        assertThrows(PhoneException.class, () -> numberCheckLength1.checkLength());
        assertThrows(PhoneException.class, () -> numberCheckLength2.checkLength());
    }

    @Test
    void checkAllNumber() {
        assertThrows(PhoneException.class, () -> numberCheckAllNumber.checkAllNumber());
    }
}