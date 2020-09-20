package ru.bank.users.paymentAttributes;

import lombok.Getter;

@Getter
public enum СurrencyMoney {
    RUB(643), USD(840), EUR(978);

    private int code;

    СurrencyMoney(int code) {
        this.code = code;
    }
}
