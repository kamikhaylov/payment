package ru.bank.server.command;

public interface Pay {
    String pay(int transferAmount, String сurrencyMoney, String numberAccountUser, String numberPhoneClient);
}