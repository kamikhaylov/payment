package ru.bank.command;

import lombok.AllArgsConstructor;
import ru.bank.users.User;

@AllArgsConstructor
public class PaymentPhone implements Pay {

    //  private int transferAmount;
    //  private String сurrencyMoney;
    //  private User user;
    //  private User client;
    //  private Server server;

    public void pay(int transferAmount, String сurrencyMoney, User user, User client) {

        System.out.println("Оплата со счета пользователя: " + user.getNumberAccount().getNumberAccount() +
                " на номер телефона клиента: " + client.getNumberPhone() + " произведена успешно. \n" +
                "Сумма платежа: " + transferAmount + " " + сurrencyMoney);

    }
}