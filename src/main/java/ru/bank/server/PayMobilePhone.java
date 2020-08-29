package ru.bank.server;

public class PayMobilePhone implements Pay {

    public void pay() {
        System.out.println("Оплата произведена успешно");
        // Производит оплату и сообщает Серверу результат
    }
}
