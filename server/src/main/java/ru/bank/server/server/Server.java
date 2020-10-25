package ru.bank.server.server;

import ru.bank.server.users.User;
import ru.bank.server.users.paymentAttributes.Account;
import ru.bank.server.users.paymentAttributes.Сurrency;

public interface Server {
    String makePhonePayment(int transferAmount, Сurrency сurrency, User user, Account accountNumberUser, User client, String paymentIdentifier);
}