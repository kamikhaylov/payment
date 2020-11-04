package ru.bank.app.application;

public interface Application {

    String makePhonePayment(String numberPhone, String account, String numberPhoneClient, int transferAmount);
}
