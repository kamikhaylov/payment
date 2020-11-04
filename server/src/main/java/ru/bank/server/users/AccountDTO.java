package ru.bank.server.users;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.bank.server.users.paymentAttributes.Сurrency;

@RequiredArgsConstructor
@Getter
public class AccountDTO {
    private final String numberPhone;
    private final String account;
    private final int amount;
    private final Сurrency сurrency;
}
