package ru.bank.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.bank.app.application.WebApplication;
import ru.bank.users.User;
import ru.bank.users.paymentAttributes.Account;
import ru.bank.users.paymentAttributes.AccountIndividual;
import ru.bank.users.paymentAttributes.Сurrency;

public class Main {

    public static void main(String[] args) {

        // Инициализируется пользователь приложения
        Account debitAccountNumberUser = new AccountIndividual("1111222233334444", 500000000, Сurrency.RUB);
        User user = new User("+79001111111", debitAccountNumberUser);

        // Инициализируется клиент банка, на чей номер телефона будет осуществляться перевод
        User client = new User("+79002222222");

        // Bean. Инициализируем приложение и запускаем эмитацию запроса оплаты с выводом результата на консоль
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.bank.app.application");
        WebApplication webApplication = context.getBean(WebApplication.class);

        System.out.println(webApplication.makePhonePayment(1000, Сurrency.RUB, user, client));

        // Эмитация запроса информации о платеже
        System.out.print("Детали платежа: ");
        System.out.println(webApplication.viewDetailsTransaction(1));
    }
}