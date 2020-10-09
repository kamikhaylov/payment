package ru.bank.app;

import lombok.Getter;
import ru.bank.app.command.CommandServerInput;
import ru.bank.app.command.GenerateIndenifier;
import ru.bank.app.exception.NumberAccountException;
import ru.bank.app.exception.NumberPhoneException;
import ru.bank.app.validation.NumberAccountValidation;
import ru.bank.app.validation.NumberPhoneValidation;
import ru.bank.server.BankServer;
import ru.bank.users.User;
import ru.bank.users.paymentAttributes.NumberAccount;

@Getter
public class WebApplication implements Application {
    private GenerateIndenifier generateIndenifier = new GenerateIndenifier();
    private CommandServerInput commandServerInput = new CommandServerInput();

    public WebApplication() {
    }

    @Override
    public String makePaymentPhone(int transferAmount, String currencyMoney, User user, User client, BankServer bankServer) {
        String result = "Ошибка при выполнении";
        NumberPhoneValidation numberPhoneValidation = new NumberPhoneValidation(client.getNumberPhone());
        NumberAccountValidation<NumberAccount> numberAccountValidation = new NumberAccountValidation<>(user.getNumberAccount());

        try {
            numberPhoneValidation.checkPrefix().checkLength().checkAllNumber();
            numberAccountValidation.checkLength().checkAllNumber();
            result = commandServerInput.executePayment(transferAmount, currencyMoney, user, client, bankServer, generateIndenifier.generateIndenifier(user.getNumberPhone()));
        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
            throw e;
        } catch (NumberAccountException e) {
            System.out.println(e);
            System.out.println(e.getNumberAccount());
            throw e;
        }
        return result;
    }

    @Override
    public String viewDetailsUser(String numberPhone, BankServer bankServer) {
        return commandServerInput.requestDetailsUser(numberPhone, bankServer);
    }

    @Override
    public String viewDetailsTransaction(int numberTransaction, BankServer bankServer) {
        return commandServerInput.requestDetailsTransaction(numberTransaction, bankServer);
    }
}