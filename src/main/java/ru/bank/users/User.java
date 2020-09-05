
package ru.bank.users;

import ru.bank.paymentAttributes.NumberAccount;
import ru.bank.paymentAttributes.NumberMobilePhone;

public class User {
    private NumberMobilePhone numberMobilePhoneUser;
    private NumberAccount AccountNumberUser;

    public User(NumberMobilePhone numberMobilePhoneUser, NumberAccount AccountNumberUser) {
        this.numberMobilePhoneUser = numberMobilePhoneUser;
        this.AccountNumberUser = AccountNumberUser;
    }

    public NumberMobilePhone getNumberMobilePhoneUser() {
        return numberMobilePhoneUser;
    }

    public NumberAccount getAccountNumberUser() {
        return AccountNumberUser;
    }

    @Override
    public String toString() {
        return "Данные о пользователе: \n" +
                "Номер мобильного телефона: " + this.numberMobilePhoneUser + "\n" +
                "Номер счета: " + this.AccountNumberUser + "\n";
    }
}