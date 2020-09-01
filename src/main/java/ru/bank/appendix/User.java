package ru.bank.appendix;

public class User {
    private long numberMobilePhoneUser;
    private long debitAccountNumberUser;

    public User(long numberMobilePhoneUser, long debitAccountNumberUser) {
        this.numberMobilePhoneUser = numberMobilePhoneUser;
        this.debitAccountNumberUser = debitAccountNumberUser;
    }

    public long getNumberMobilePhoneUser() {
        return numberMobilePhoneUser;
    }

    public long getDebitAccountNumberUser() {
        return debitAccountNumberUser;
    }

    @Override
    public String toString() {
        return "Данные о пользователе: \n" +
                "Номер мобильного телефона: " + this.numberMobilePhoneUser + "\n" +
                "Номер счета списания средств: " + this.debitAccountNumberUser + "\n";
    }


}