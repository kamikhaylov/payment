package ru.bank.server.validation;

import lombok.AllArgsConstructor;
import ru.bank.server.exception.PaymentIndetifierException;

import java.util.ArrayList;

@AllArgsConstructor
public class PaymentIndetifierValidation {
    private String paymentIndetifier;
    private ArrayList<String> listPaymentIndetifier = new ArrayList<>();

    public PaymentIndetifierValidation checkDoublePaymentPhone() throws PaymentIndetifierException {
        for (String list : listPaymentIndetifier) {
            if (paymentIndetifier.equals(list)) {
                throw new PaymentIndetifierException("Дублирующий запрос платежа: " + paymentIndetifier, paymentIndetifier);
            }
        }
        return this;
    }
}