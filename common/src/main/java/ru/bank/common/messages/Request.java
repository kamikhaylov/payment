package ru.bank.common.messages;

import lombok.Value;
import ru.bank.common.users.User;
import ru.bank.common.users.paymentAttributes.Сurrency;

@Value
public class Request {
    private final int transferAmount;
    private final Сurrency сurrency;
    private final User user;
    private final User client;
    private final String paymentIdentifier;
}
