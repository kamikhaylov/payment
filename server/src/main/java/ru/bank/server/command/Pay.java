package ru.bank.server.command;

import ru.bank.server.users.paymentAttributes.Сurrency;

public interface Pay {
    String pay(int transferAmount, Сurrency сurrency, String accountUser, String phoneClient);
}