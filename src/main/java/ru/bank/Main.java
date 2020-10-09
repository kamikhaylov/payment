package ru.bank;

import ru.bank.app.WebApplication;
import ru.bank.server.BankServer;
import ru.bank.users.User;
import ru.bank.users.paymentAttributes.NumberAccount;
import ru.bank.users.paymentAttributes.NumberAccountIndividual;
import ru.bank.users.paymentAttributes.СurrencyMoney;

public class Main {

    public static void main(String[] args) {

        // Инициализируется пользователь приложения, добавление в коллекцию храннения базы данных
        NumberAccount debitAccountNumberUser = new NumberAccountIndividual("1111222233334444", 500000000, СurrencyMoney.RUB.name());
        User user = new User("+79001111111", debitAccountNumberUser);

        // Инициализируется клиент банка, на чей номер телефона будет осуществляться перевод
        User client = new User("+79002222222");

        // Инициализируется сервер для проведения оплаты
        BankServer bankServer = new BankServer("192.168.0.1", "8080", "TCP", "bank");
        // Добавление пользователя в базу данных на сервере
        bankServer.getBaseUsers().putUser(user);

        // Инициализируется сумма и валюта оплаты
        int transferAmount = 1000;
        String currencyMoney = СurrencyMoney.RUB.name();

        // Инициализируем приложение и запускаем эмитацию запроса оплаты с выводом результата на консоль
        WebApplication webApplication = new WebApplication();
        System.out.println(webApplication.makePaymentPhone(transferAmount, currencyMoney, user, client, bankServer));

        // Эмитация запроса деталей пользователя
        System.out.print("Детали пользователя: ");
        System.out.println(webApplication.viewDetailsUser("+79001111111", bankServer));

        // Эмитация запроса информации о платеже
        System.out.print("Детали платежа: ");
        System.out.println(webApplication.viewDetailsTransaction(1, bankServer));
    }
}