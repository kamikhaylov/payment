package ru.bank.command;

import ru.bank.appendix.App;
import ru.bank.appendix.User;

public class CommandOperationPay implements Command {

    private User user;
    private long transferAmount;
    private String currency;
    private long numberMobilePhoneClient;
    private long transferAccountNumberClient;
    private App app;


    public CommandOperationPay(User user, long transferAmount, String currency, long numberMobilePhoneClient, long transferAccountNumberClient, App app) {
        this.user = user;
        this.transferAmount = transferAmount;
        this.currency = currency;
        this.numberMobilePhoneClient = numberMobilePhoneClient;
        this.transferAccountNumberClient = transferAccountNumberClient;
        this.app = app;

    }

    @Override
    public void execute() {

    }

    @Override
    public String toString() {
        return "Запрос об оплате напрален на сервер: \n" +
                user +
                "Сумма перевода: " + transferAmount + "\n" +
                "Валюта: " + currency + "\n" +
                "Мобильный номер получателя: " + numberMobilePhoneClient + "\n" +
                "Номер счета получателя: " + transferAccountNumberClient + "\n" +
                app;
    }


    // CommandOperationPay формирует данные о пользователе и о получателе, и отправляем данные об оплате на Server
    // Возвращает результат в Приложение

}