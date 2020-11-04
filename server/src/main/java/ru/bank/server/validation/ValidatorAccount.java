package ru.bank.server.validation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.bank.server.users.paymentAttributes.Account;

@AllArgsConstructor
@Getter
public class ValidatorAccount<T extends Account> {
    private T numberAccount;

    private СheckLengthAccount<T> сheckLengthAccount = new СheckLengthAccount<>();
    private CheckAllNumberAccount<T> checkAllNumberAccount = new CheckAllNumberAccount<>();

    public ValidatorAccount(T numberAccount) {
        this.numberAccount = numberAccount;
    }

    public ValidatorAccount checkLength() {
        this.сheckLengthAccount.checkLength(() -> numberAccount);
        return this;
    }

    public ValidatorAccount checkAllNumber() {
        this.checkAllNumberAccount.checkAllNumber(() -> numberAccount);
        return this;
    }
}
