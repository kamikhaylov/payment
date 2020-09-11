package ru.bank.server.validation;

import lombok.AllArgsConstructor;
import ru.bank.exception.server.PaymentIndetifierException;

import java.util.ArrayList;

@AllArgsConstructor
public class PaymentIndetifierValidation {
    ArrayList<String> listPaymentIndetifier = new ArrayList<>();
    private String paymentIndetifier;

    public PaymentIndetifierValidation checkDoublePaymentPhone() throws PaymentIndetifierException {
        for (String list : listPaymentIndetifier) {
            if (paymentIndetifier.equals(list)) {
                throw new PaymentIndetifierException("Дублирующий запрос платежа: " + paymentIndetifier, paymentIndetifier);
            }
        }
        return this;
    }
}