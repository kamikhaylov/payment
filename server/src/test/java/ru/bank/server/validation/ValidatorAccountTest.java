package ru.bank.server.validation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.bank.server.exception.AccountException;
import ru.bank.server.users.paymentAttributes.AccountIndividual;
import ru.bank.server.users.paymentAttributes.Сurrency;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ValidatorAccountTest {
    AccountIndividual account1;
    ValidatorAccount<AccountIndividual> validator1;

    AccountIndividual account2;
    ValidatorAccount<AccountIndividual> validator2;

    AccountIndividual account3;
    ValidatorAccount<AccountIndividual> validator3;

    @BeforeEach
    void setUp() {
        account1 = new AccountIndividual("111122223333444", 50000, Сurrency.RUB);
        validator1 = new ValidatorAccount<>(account1);

        account2 = new AccountIndividual("11112222333344445", 50000, Сurrency.RUB);
        validator2 = new ValidatorAccount<>(account2);

        account3 = new AccountIndividual("111122223333wwww", 50000, Сurrency.RUB);
        validator3 = new ValidatorAccount<>(account3);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkLength() {
        assertThrows(AccountException.class, () -> validator1.checkLength());
        assertThrows(AccountException.class, () -> validator2.checkLength());
    }

    @Test
    void checkAllNumber() {
        assertThrows(AccountException.class, () -> validator3.checkAllNumber());
    }
}