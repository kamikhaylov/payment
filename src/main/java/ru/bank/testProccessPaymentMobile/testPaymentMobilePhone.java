package ru.bank.testProccessPaymentMobile;

import ru.bank.appendix.App;
import ru.bank.appendix.User;
import ru.bank.command.CommandOperationPay;
import ru.bank.server.PayMobilePhone;

/*
    Класс testPaymentMobilePhone предназначен для эмитации входных данных
    и тестирования выполнения usecase "Оплата номера телефона в приложении".
 */


public class testPaymentMobilePhone {
    public static void main(String[] args) {


        User user = new User(89001001010l, 1111222233334444l);
        System.out.println("Сформированы данные: \n" + user.toString());

        App app = new App("192.168.0.1", "8080", "TCP", "bank");
        System.out.println("Сформированы данные: \n" + app.toString());

        CommandOperationPay commandOperationPay = new CommandOperationPay(user,
                1000l,
                "RUB",
                89002002020l,
                2222333344445555l,
                app);
        System.out.println(commandOperationPay.toString());

        PayMobilePhone payMobilePhone = new PayMobilePhone(commandOperationPay);
        payMobilePhone.pay();

    }
}
