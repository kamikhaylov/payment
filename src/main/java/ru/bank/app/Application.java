package ru.bank.app;

import ru.bank.server.BankServer;
import ru.bank.users.User;

public interface Application {

    String makePaymentPhone(int transferAmount, String currencyMoney, User user, User client, BankServer bankServer);

    String viewDetailsUser(String numberPhone, BankServer bankServer);

    String viewDetailsTransaction(int numberTransaction, BankServer bankServer);

}
