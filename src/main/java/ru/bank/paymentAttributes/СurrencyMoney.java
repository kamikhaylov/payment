package ru.bank.paymentAttributes;

public enum СurrencyMoney {
    RUB("RUB"), USD("USD"), EUR("EUR");

    String currensyMoney;

    СurrencyMoney(String currensyMoney) {
        this.currensyMoney = currensyMoney;
    }

    public String getCurrensyMoney() {
        return currensyMoney;
    }
}
