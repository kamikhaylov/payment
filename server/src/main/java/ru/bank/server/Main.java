package ru.bank.server;

import ru.bank.users.User;
import ru.bank.users.baseUsers.BaseUsers;
import ru.bank.users.baseUsers.HisoryTransaction;
import ru.bank.users.paymentAttributes.Account;
import ru.bank.users.paymentAttributes.AccountIndividual;
import ru.bank.users.paymentAttributes.Сurrency;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Наполняем базу данных, пользотвателем
        Account debitAccountNumberUser = new AccountIndividual("1111222233334444", 500000000, Сurrency.RUB);
        User user = new User("+79001111111", debitAccountNumberUser);

        // Инициализируется сервер для проведения оплаты
        BankServer bankServer = new BankServer(new ArrayList<String>(), new BaseUsers(), new HisoryTransaction(), "192.168.0.1", "8080", "TCP", "bank");
        // Добавление пользователя в базу данных на сервере
        bankServer.getBaseUsers().putUser(user);
    }
}
