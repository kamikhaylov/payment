package ru.bank.app.application;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import ru.bank.app.command.GeneratorID;
import ru.bank.app.exception.AccountException;
import ru.bank.app.exception.PhoneException;
import ru.bank.app.validation.ValidatorAccount;
import ru.bank.app.validation.ValidatorPhone;
import ru.bank.server.BankServer;
import ru.bank.users.User;
import ru.bank.users.baseUsers.BaseUsers;
import ru.bank.users.baseUsers.HisoryTransaction;
import ru.bank.users.paymentAttributes.Account;
import ru.bank.users.paymentAttributes.Сurrency;

import java.util.ArrayList;

@Getter
@Setter
@Component
public class WebApplication implements Application {
    private GeneratorID generatorID;
    private BankServer bankServer;

    public WebApplication() {
        this.generatorID = new GeneratorID();
        this.bankServer = new BankServer(new ArrayList<String>(), new BaseUsers(), new HisoryTransaction(), "192.168.0.1", "8080", "TCP", "bank");
    }


    @Override
    public String makePhonePayment(int transferAmount, Сurrency сurrency, User user, User client) {
        String result = "Ошибка при выполнении";
        ValidatorPhone numberPhoneValidation = new ValidatorPhone(client.getNumberPhone());
        ValidatorAccount<Account> validatorAccount = new ValidatorAccount<>(user.getAccount());

        try {
            numberPhoneValidation.checkPrefix().checkLength().checkAllNumber();
        } catch (PhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
            throw e;
        }

        try {
            validatorAccount.checkLength().checkAllNumber();
        } catch (AccountException e) {
            System.out.println(e);
            System.out.println(e.getNumberAccount());
            throw e;
        }

        result = bankServer.makePhonePayment(transferAmount, сurrency, user, client, generatorID.generateIndenifier(user.getNumberPhone()));
        return result;
    }

    @Override
    public String viewDetailsUser(String numberPhone) {
        return bankServer.getBaseUsers().viewDetailsUser(numberPhone);
    }

    @Override
    public String viewDetailsTransaction(int numberTransaction) {
        return bankServer.getHisoryTransaction().viewDetailsTransaction(numberTransaction);
    }
}