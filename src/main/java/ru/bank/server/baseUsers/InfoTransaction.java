package ru.bank.server.baseUsers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import ru.bank.users.User;

@AllArgsConstructor
@Getter
@ToString
public class InfoTransaction {
    private int numberTransaction;
    private User user;
    private User client;
    private int transferAmount;
    private String currencyMoney;
}
