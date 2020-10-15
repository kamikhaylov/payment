package ru.bank.common.users.paymentAttributes;

import lombok.Getter;

@Getter
public enum Сurrency {
    RUB(643), USD(840), EUR(978);

    private int code;

    Сurrency(int code) {
        this.code = code;
    }
}
