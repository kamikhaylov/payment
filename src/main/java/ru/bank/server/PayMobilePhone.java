package ru.bank.server;

import ru.bank.command.CommandOperationPay;

public class PayMobilePhone implements Pay {

    private CommandOperationPay commandOperationPay;

    public PayMobilePhone(CommandOperationPay commandOperationPay) {
        this.commandOperationPay = commandOperationPay;
    }

    @Override
    public void pay() {
        System.out.println("Оплата произведена успешно");
        // Производит оплату и сообщает Серверу результат
    }
}
