package ru.bank.server;

import ru.bank.users.User;

public interface Server {
    String makePaymentPhone(int transferAmount, String сurrencyMoney, User user, User client, String paymentIdentifier);
}