package ru.bank.app;

import lombok.Getter;
import ru.bank.app.validation.NumberPhoneValidation;
import ru.bank.command.CommandServerInput;
import ru.bank.command.GenerateIndenifier;
import ru.bank.exception.app.NumberPhoneException;
import ru.bank.server.BankServer;
import ru.bank.users.User;

@Getter
public class WebApplication implements Application {
    GenerateIndenifier generateIndenifier = new GenerateIndenifier();

    public WebApplication() {
    }

    public void makePaymentPhone(int transferAmount, String currencyMoney, User user, User client, BankServer bankServer) {
        NumberPhoneValidation numberPhoneValidation = new NumberPhoneValidation(client.getNumberPhone());
        try {
            numberPhoneValidation.checkPrefix().checkLength().checkAllNumber();
            CommandServerInput commandServerInput = new CommandServerInput();
            commandServerInput.execute(transferAmount, currencyMoney, user, client, bankServer, generateIndenifier.generateIndenifier(user.getNumberPhone()));
//            Эмитация повторного запроса
//            commandServerInput.execute(transferAmount, currencyMoney, user, client, bankServer, "90011111112");
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
    }
}
