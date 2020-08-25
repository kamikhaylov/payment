package ru.bank.appendix;

import ru.bank.user.Command;

public class App implements Pay {

    Command commandOperation = new Command();
    private String ip;
    private String port;
    private String protocol;
    private String server;

    public void pay() {
        System.out.println("Выполнение операции Оплата номера телефона");
        commandOperation.inputMobilePhoneClient();
        System.out.println("Операция выполнена");
    }
}