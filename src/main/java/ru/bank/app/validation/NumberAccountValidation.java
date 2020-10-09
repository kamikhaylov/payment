package ru.bank.app.validation;

import lombok.Getter;
import ru.bank.users.paymentAttributes.NumberAccount;

@Getter
public class NumberAccountValidation<T extends NumberAccount> {
    private T numberAccount;

    СheckLengthAccount<T> сheckLengthAccount = new СheckLengthAccount<>();
    CheckAllNumberAccount<T> checkAllNumberAccount = new CheckAllNumberAccount<>();

    public NumberAccountValidation(T numberAccount) {
        this.numberAccount = numberAccount;
    }

    public NumberAccountValidation checkLength() {
        this.сheckLengthAccount.checkLength(() -> numberAccount);
        return this;
    }

    public NumberAccountValidation checkAllNumber() {
        this.checkAllNumberAccount.checkAllNumber(() -> numberAccount);
        return this;
    }
}
