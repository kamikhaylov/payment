package ru.bank.app.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.bank.server.BankServer;
import ru.bank.users.User;

@AllArgsConstructor
@Getter
public class CommandServerInput implements Command {

    @Override
    public String executePayment(int transferAmount, String сurrencyMoney, User user, User client, BankServer bankServer, String paymentIdentifier) {
        return bankServer.makePaymentPhone(transferAmount, сurrencyMoney, user, client, paymentIdentifier);
    }

    @Override
    public String requestDetailsUser(String numberPhone, BankServer bankServer) {
        return bankServer.getBaseUsers().viewDetailsUser(numberPhone);
    }

    @Override
    public String requestDetailsTransaction(int numberTransaction, BankServer bankServer) {
        return bankServer.getHisoryTransaction().viewDetailsTransaction(numberTransaction);
    }
}