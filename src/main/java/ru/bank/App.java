package ru.bank;

import ru.bank.pay.PayMobilePhone;
import ru.bank.paymentAttributes.NumberAccount;
import ru.bank.paymentAttributes.NumberMobilePhone;
import ru.bank.paymentAttributes.СurrencyMoney;
import ru.bank.server.Server;
import ru.bank.users.User;

public class App {

    public static void main(String[] args) {
        NumberMobilePhone numberMobilePhoneUser = new NumberMobilePhone(89001001010l);
        NumberAccount debitAccountNumberUser = new NumberAccount(1111222233334444l);
        User user = new User(numberMobilePhoneUser, debitAccountNumberUser);

        NumberMobilePhone numberMobilePhoneClient = new NumberMobilePhone(89002002020l);
        NumberAccount transferAccountNumberClient = new NumberAccount(1111222233334444l);
        User client = new User(numberMobilePhoneClient, transferAccountNumberClient);

        Server server = new Server("192.168.0.1", "8080", "TCP", "bank");

        PayMobilePhone payMobilePhone = new PayMobilePhone(1000l, СurrencyMoney.RUB.getCurrensyMoney(), user, client, server);
        payMobilePhone.pay();

    }
}