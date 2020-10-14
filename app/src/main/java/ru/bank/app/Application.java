package ru.bank.app;

import ru.bank.users.User;
import ru.bank.users.paymentAttributes.Сurrency;

public interface Application {

    String makePhonePayment(int transferAmount, Сurrency сurrency, User user, User client);

    String viewDetailsUser(String numberPhone);

    String viewDetailsTransaction(int numberTransaction);

}
