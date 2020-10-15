package ru.bank.common.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import ru.bank.common.users.paymentAttributes.Account;

@AllArgsConstructor
@Getter
@ToString
public class User {
    private String numberPhone;
    private Account account;

    public User(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}