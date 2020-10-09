package ru.bank.server.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.bank.users.paymentAttributes.Сurrency;

@AllArgsConstructor
@Getter
public class PhonePayment implements Pay {

    @Override
    public String pay(int transferAmount, Сurrency сurrency, String numberAccountUser, String numberPhoneClient) {

        return "Оплата со счета пользователя: " + numberAccountUser +
                " на номер телефона клиента: " + numberPhoneClient + " произведена успешно. \n" +
                "Сумма платежа: " + transferAmount + " " + сurrency;
    }
}