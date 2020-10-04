package ru.bank.command;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.bank.server.BankServer;
import ru.bank.server.exception.PaymentIndetifierException;
import ru.bank.users.User;
import ru.bank.users.paymentAttributes.NumberAccount;
import ru.bank.users.paymentAttributes.NumberAccountIndividual;
import ru.bank.users.paymentAttributes.СurrencyMoney;

class CommandServerInputTest {
    CommandServerInput commandServerInput;
    NumberAccount debitAccountNumberUser;
    User user;
    User client;
    BankServer bankServer;
    int transferAmount;
    String currencyMoney;
    GenerateIndenifier generateIndenifier;

    @BeforeEach
    void setUp() {
        commandServerInput = new CommandServerInput();
        debitAccountNumberUser = new NumberAccountIndividual("1111222233334444", 500000000, СurrencyMoney.RUB.name());
        user = new User("+79001111111", debitAccountNumberUser);
        client = new User("+79002222222");
        bankServer = new BankServer("192.168.0.1", "8080", "TCP", "bank");
        transferAmount = 1000;
        currencyMoney = СurrencyMoney.RUB.name();
        generateIndenifier = new GenerateIndenifier();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void execute() {
        try {
            commandServerInput.execute(transferAmount, currencyMoney, user, client, bankServer, generateIndenifier.generateIndenifier(user.getNumberPhone()));
//        Эмитация повторных запросов
            commandServerInput.execute(transferAmount, currencyMoney, user, client, bankServer, "90011111111");
            commandServerInput.execute(transferAmount, currencyMoney, user, client, bankServer, "90011111111");
        } catch (PaymentIndetifierException e) {
            System.out.println(e);
            System.out.println(e.getPaymentIndetifier());
        }
    }
}