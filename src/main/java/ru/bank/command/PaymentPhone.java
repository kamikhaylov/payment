package ru.bank.command;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentPhone implements Pay {

    public void pay(int transferAmount, String сurrencyMoney, String numberAccountUser, String numberPhoneClient) {

        System.out.println("Оплата со счета пользователя: " + numberAccountUser +
                " на номер телефона клиента: " + numberPhoneClient + " произведена успешно. \n" +
                "Сумма платежа: " + transferAmount + " " + сurrencyMoney);
    }
}