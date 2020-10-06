package ru.bank.app.command;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentPhone implements Pay {

    @Override
    public String pay(int transferAmount, String сurrencyMoney, String numberAccountUser, String numberPhoneClient) {

        return "Оплата со счета пользователя: " + numberAccountUser +
                " на номер телефона клиента: " + numberPhoneClient + " произведена успешно. \n" +
                "Сумма платежа: " + transferAmount + " " + сurrencyMoney;
    }
}