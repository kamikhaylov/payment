package ru.bank.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.bank.server.BankServer;
import ru.bank.users.User;

@AllArgsConstructor
@Getter
public class CommandServerInput implements Command {

    public void execute(int transferAmount, String сurrencyMoney, User user, User client, BankServer bankServer, String paymentIdentifier) {
        System.out.println("Отправлен запрос на " + bankServer.toString());
        bankServer.makePaymentPhone(transferAmount, сurrencyMoney, user, client, paymentIdentifier);
    }
}
