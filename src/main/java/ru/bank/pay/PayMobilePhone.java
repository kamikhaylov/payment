package ru.bank.pay;

import ru.bank.server.Server;
import ru.bank.users.User;


public class PayMobilePhone implements Pay {

    private long transferAmount;
    private String сurrencyMoney;
    private User user;
    private User client;
    private Server server;

    public PayMobilePhone(long transferAmount, String сurrencyMoney, User user, User client, Server server) {
        this.transferAmount = transferAmount;
        this.сurrencyMoney = сurrencyMoney;
        this.user = user;
        this.client = client;
        this.server = server;
    }

    @Override
    public void pay() {
        System.out.println("Оплата со счета пользователя " +
                "на счет клиента произведена успешно");
    }
}
