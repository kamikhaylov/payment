package ru.bank.server;

import ru.bank.common.users.User;
import ru.bank.common.users.paymentAttributes.Сurrency;

public interface Server {
    String makePhonePayment(int transferAmount, Сurrency сurrency, User user, User client, String paymentIdentifier);
}