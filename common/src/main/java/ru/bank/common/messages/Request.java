package ru.bank.common.messages;

import lombok.Value;

@Value
public class Request {
    private final String numberPhone;
    private final String account;
    private final String numberPhoneClient;
    private final int transferAmount;
    private final String paymentIdentifier;
}
