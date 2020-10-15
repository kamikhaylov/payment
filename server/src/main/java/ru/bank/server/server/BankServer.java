package ru.bank.server.server;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import ru.bank.common.users.User;
import ru.bank.common.users.baseUsers.BaseUsers;
import ru.bank.common.users.baseUsers.HisoryTransaction;
import ru.bank.common.users.baseUsers.InfoTransaction;
import ru.bank.common.users.paymentAttributes.Сurrency;
import ru.bank.server.command.PhonePayment;
import ru.bank.server.exception.PaymentIndetifierException;
import ru.bank.server.validation.ValidatorPaymentIndetifier;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@ToString
public class BankServer implements Server {
    private ArrayList<String> listPaymentIdentifier;
    private BaseUsers baseUsers;
    private HisoryTransaction hisoryTransaction;
    private String ip;
    private String port;
    private String protocol;
    private String server;

    @Override
    public String makePhonePayment(int transferAmount, Сurrency сurrency, User user, User client, String paymentIdentifier) {
        String result = "Ошибка при выполнении";
        System.out.println("Получен запрос от пользователя " + user.getNumberPhone());
        ValidatorPaymentIndetifier validatorPaymentIndetifier = new ValidatorPaymentIndetifier(paymentIdentifier, listPaymentIdentifier);
        int numberTransaction = hisoryTransaction.newNumberTransaction();

        try {
            validatorPaymentIndetifier.checkDoublePaymentPhone();
        } catch (PaymentIndetifierException e) {
            System.out.println(e);
            System.out.println(e.getPaymentIndetifier());
            throw e;
        }

        listPaymentIdentifier.add(paymentIdentifier);
        PhonePayment phonePayment = new PhonePayment();
        result = phonePayment.pay(transferAmount, сurrency, user.getAccount().getAccount(), client.getNumberPhone());
        InfoTransaction infoTransaction = new InfoTransaction(numberTransaction, user.getAccount().getAccount(), client.getNumberPhone(), transferAmount, сurrency);
        hisoryTransaction.putNumberTransaction(infoTransaction);

        return result;
    }
}