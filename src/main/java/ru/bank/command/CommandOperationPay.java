package ru.bank.command;

public class CommandOperationPay implements Command {

    private int transferAmount;
    private String currency;
    private int numberMobilePhoneClient;
    private int transferAccountNumberClient;

    public void execute() {
        System.out.println("Запрос об оплате направлен");
    }

    // CommandOperationPay формирует данные о пользователя и о получатели, и отправляем данные об оплате на Server

}
