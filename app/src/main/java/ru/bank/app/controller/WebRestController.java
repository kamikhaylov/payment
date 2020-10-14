package ru.bank.app.controller;

import org.springframework.web.bind.annotation.RestController;
import ru.bank.app.Application;
import ru.bank.app.WebApplication;
import ru.bank.app.command.GeneratorID;
import ru.bank.users.User;
import ru.bank.users.paymentAttributes.Account;
import ru.bank.users.paymentAttributes.AccountIndividual;
import ru.bank.users.paymentAttributes.Сurrency;

@RestController
public class WebRestController {

    // Инициализируется пользователь приложения
    Account debitAccountNumberUser = new AccountIndividual("1111222233334444", 500000000, Сurrency.RUB);
    User user = new User("+79001111111", debitAccountNumberUser);

    // Инициализируется клиент банка, на чей номер телефона будет осуществляться перевод
    User client = new User("+79002222222");

//        // Инициализируется сервер для проведения оплаты
//        BankServer bankServer = new BankServer(new ArrayList<String>(), new BaseUsers(), new HisoryTransaction(), "192.168.0.1", "8080", "TCP", "bank");
//        // Добавление пользователя в базу данных на сервере
//        bankServer.getBaseUsers().putUser(user);

    // Инициализируем приложение и запускаем эмитацию запроса оплаты с выводом результата на консоль
    Application webApplication = new WebApplication(new GeneratorID());

//        System.out.println(webApplication.makePhonePayment(1000, Сurrency.RUB, user, client));
//        webApplication.makePhonePayment(1000, Сurrency.RUB, user, client);

//        // Эмитация запроса деталей пользователя
//        System.out.print("Детали пользователя: ");
//        System.out.println(webApplication.viewDetailsUser("+79001111111"));
//
//        // Эмитация запроса информации о платеже
//        System.out.print("Детали платежа: ");
//        System.out.println(webApplication.viewDetailsTransaction(1));
}
