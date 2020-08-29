package ru.bank.command;

public class CommandOperationPay implements Command {

    private int transferAmount;
    private String currency;
    private int numberMobilePhoneClient;
    private int transferAccountNumberClient;

    public void execute() {
        System.out.println("Введите номер телефона: ");
        System.out.println("Введите сумму: ");
        System.out.println("Выберите валюту: ");
        System.out.println("Отправка данных на сервер");

        System.out.println("Запрос об оплате направлен");
    }

    // CommandOperationPay формирует данные о пользователе и о получателе, и отправляем данные об оплате на Server
    // Возвращает результат в Приложение

}
