package ru.bank.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import ru.bank.users.paymentAttributes.NumberAccount;

@AllArgsConstructor
@Getter
@ToString
public class User {
    private String numberPhone;
    private NumberAccount numberAccount;

    public User(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}