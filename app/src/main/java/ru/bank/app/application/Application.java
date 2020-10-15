package ru.bank.app.application;

import ru.bank.common.users.User;
import ru.bank.common.users.paymentAttributes.Сurrency;

public interface Application {

    String makePhonePayment(int transferAmount, Сurrency сurrency, User user, User client);

    String viewDetailsUser(String numberPhone);

    String viewDetailsTransaction(int numberTransaction);

}
