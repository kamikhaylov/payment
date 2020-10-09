package ru.bank.server;

import ru.bank.users.User;
import ru.bank.users.paymentAttributes.Сurrency;

public interface Server {
    String makePhonePayment(int transferAmount, Сurrency сurrency, User user, User client, String paymentIdentifier);
}