package ru.bank.users.paymentAttributes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Account {
    private String account;
    private int amount;
    private Сurrency сurrency;

}