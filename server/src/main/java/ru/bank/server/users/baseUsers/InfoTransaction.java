package ru.bank.server.users.baseUsers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import ru.bank.server.users.paymentAttributes.Сurrency;

@AllArgsConstructor
@Getter
@ToString
public class InfoTransaction {
    private int numberTransaction;
    private String numberAccountUser;
    private String numberPhoneClient;
    private int transferAmount;
    private Сurrency сurrency;
}
