package ru.bank.server.validation;

import lombok.AllArgsConstructor;
import ru.bank.exception.server.PaymentIndetifierException;

import java.util.ArrayList;

@AllArgsConstructor
public class PaymentIndetifierValidation {
    private String paymentIndetifier;
    ArrayList<String> listPaymentIndetifier = new ArrayList<>();

    public PaymentIndetifierValidation checkDoublePaymentPhone() throws PaymentIndetifierException {
        for (String list : listPaymentIndetifier) {
            if (paymentIndetifier.equals(list)) {
                throw new PaymentIndetifierException("Дублирующий запрос платежа: " + paymentIndetifier, paymentIndetifier);
            }
        }
        return this;
    }
}