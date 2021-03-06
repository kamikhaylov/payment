package ru.bank.server.command;

import lombok.AllArgsConstructor;
import ru.bank.server.users.paymentAttributes.Сurrency;

@AllArgsConstructor
public class PhonePayment implements Pay {

    @Override
    public String pay(int transferAmount, Сurrency сurrency, String accountUser, String phoneClient) {

        return "Оплата со счета пользователя: " + accountUser +
                " на номер телефона клиента: " + phoneClient + " произведена успешно. " +
                "Сумма платежа: " + transferAmount + " " + сurrency;
    }
}