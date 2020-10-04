package ru.bank.app;

import ru.bank.server.BankServer;
import ru.bank.users.User;

public interface Application {
    void makePaymentPhone(int transferAmount, String currencyMoney, User user, User client, BankServer bankServer);
}
