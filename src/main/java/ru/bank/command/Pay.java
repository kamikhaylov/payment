package ru.bank.command;

public interface Pay {
    void pay(int transferAmount, String сurrencyMoney, String numberAccountUser, String numberPhoneClient);
}