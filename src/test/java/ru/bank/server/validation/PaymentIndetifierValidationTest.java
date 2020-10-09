package ru.bank.server.validation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.bank.app.exception.NumberPhoneException;

import java.util.ArrayList;

class PaymentIndetifierValidationTest {

    PaymentIndetifierValidation paymentIndetifierValidation;
    ArrayList<String> listPaymentIndetifier;

    @BeforeEach
    void setUp() {
        listPaymentIndetifier = new ArrayList<>();
//        listPaymentIndetifier.add("990011122330");
        paymentIndetifierValidation = new PaymentIndetifierValidation("990011122330", listPaymentIndetifier);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkDoublePaymentPhone() {
        try {
            paymentIndetifierValidation.checkDoublePaymentPhone();
            System.out.println("Проверка checkDoublePaymentPhone пройдена");
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
    }
}