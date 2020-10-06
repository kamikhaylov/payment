package ru.bank.app.command;

import ru.bank.server.BankServer;
import ru.bank.users.User;

public interface Command {

    String executePayment(int transferAmount, String сurrencyMoney, User user, User client, BankServer bankServer, String paymentIdentifier);

    String requestDetailsUser(String numberPhone, BankServer bankServer);

    String requestDetailsTransaction(int numberTransaction, BankServer bankServer);
}