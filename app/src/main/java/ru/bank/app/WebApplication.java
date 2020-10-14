package ru.bank.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.bank.app.command.GeneratorID;
import ru.bank.app.exception.AccountException;
import ru.bank.app.exception.PhoneException;
import ru.bank.app.validation.ValidatorAccount;
import ru.bank.app.validation.ValidatorPhone;
import ru.bank.users.User;
import ru.bank.users.paymentAttributes.Account;
import ru.bank.users.paymentAttributes.Сurrency;

@AllArgsConstructor
@Getter
public class WebApplication implements Application {
    private GeneratorID generatorID;
//    private BankServer bankServer;

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

//        result = bankServer.makePhonePayment(transferAmount, сurrency, user, client, generatorID.generateIndenifier(user.getNumberPhone()));
        return result;
    }

//    @Override
//    public String viewDetailsUser(String numberPhone) {
//        return bankServer.getBaseUsers().viewDetailsUser(numberPhone);
//    }

//    @Override
//    public String viewDetailsTransaction(int numberTransaction) {
//        return bankServer.getHisoryTransaction().viewDetailsTransaction(numberTransaction);
//    }
}