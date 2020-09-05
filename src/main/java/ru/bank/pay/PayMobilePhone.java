package ru.bank.pay;

import ru.bank.exceptionPaymentAttributes.ExceptionNumberMobilePhone;
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

        try {
            client.getNumberMobilePhoneUser().checkNumber(client.getNumberMobilePhoneUser().getNumberMobilePhone());
            System.out.println("Оплата со счета пользователя: " + user.getAccountNumberUser().getNumberAccount() +
                    " на номер телефона клиента: " + client.getNumberMobilePhoneUser().getNumberMobilePhone() + " произведена успешно. \n" +
                    "Сумма платежа: " + transferAmount + " " + сurrencyMoneyUser);
        } catch (ExceptionNumberMobilePhone e) {
            System.out.println(e);
            System.out.println("Оплата не произведена");
        }
    }
}
