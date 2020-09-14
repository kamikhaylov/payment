package ru.bank.server.baseUsers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class InfoTransaction {
    private int numberTransaction;
    private String numberAccountUser;
    private String numberPhoneClient;
    private int transferAmount;
    private String currencyMoney;
}
