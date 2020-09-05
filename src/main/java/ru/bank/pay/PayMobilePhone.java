package ru.bank.pay;

import ru.bank.server.Server;
import ru.bank.users.User;


public class PayMobilePhone implements Pay {

    private long transferAmount;
    private String сurrencyMoneyUser;
    private User user;
    private User client;
    private Server server;

    public PayMobilePhone(long transferAmount, String сurrencyMoneyUser, User user, User client, Server server) {
        this.transferAmount = transferAmount;
        this.сurrencyMoneyUser = сurrencyMoneyUser;
        this.user = user;
        this.client = client;
        this.server = server;
    }

    @Override
    public void pay() {

        //   user.getNumberMobilePhoneUser().checkNumber();

        System.out.println("Оплата со счета пользователя: " + user.getAccountNumberUser().getNumberAccount() +
                " на счет клиента: " + client.getAccountNumberUser().getNumberAccount() + " произведена успешно. \n" +
                "Сумма платежа: " + transferAmount + " " + сurrencyMoneyUser);

    }
}
