package ru.bank.server.validation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.bank.server.exception.PaymentIndetifierException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ValidatorPaymentIndetifierTest {

    ValidatorPaymentIndetifier validatorPaymentIndetifier;
    ArrayList<String> listPaymentIndetifier;

    @BeforeEach
    void setUp() {
        listPaymentIndetifier = new ArrayList<>();
        listPaymentIndetifier.add("990011122330");
        validatorPaymentIndetifier = new ValidatorPaymentIndetifier("990011122330", listPaymentIndetifier);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkDoublePaymentPhone() {
        assertThrows(PaymentIndetifierException.class, () -> validatorPaymentIndetifier.checkDoublePaymentPhone());
    }
}