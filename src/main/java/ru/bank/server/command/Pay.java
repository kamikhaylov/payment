package ru.bank.server.command;

import ru.bank.users.paymentAttributes.Сurrency;

public interface Pay {
    String pay(int transferAmount, Сurrency сurrency, String numberAccountUser, String numberPhoneClient);
}