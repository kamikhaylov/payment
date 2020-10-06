package ru.bank.server;

import lombok.Getter;
import lombok.ToString;
import ru.bank.server.baseUsers.BaseUsers;
import ru.bank.server.baseUsers.HisoryTransaction;
import ru.bank.server.baseUsers.InfoTransaction;
import ru.bank.server.command.PaymentPhone;
import ru.bank.server.exception.PaymentIndetifierException;
import ru.bank.server.validation.PaymentIndetifierValidation;
import ru.bank.users.User;

import java.util.ArrayList;

@Getter
@ToString
public class BankServer implements Server {
    private ArrayList<String> listPaymentIdentifier = new ArrayList<String>();
    private BaseUsers baseUsers = new BaseUsers();
    private HisoryTransaction hisoryTransaction = new HisoryTransaction();
    private String ip;
    private String port;
    private String protocol;
    private String server;

    public BankServer(String ip, String port, String protocol, String server) {
        this.ip = ip;
        this.port = port;
        this.protocol = protocol;
        this.server = server;
    }

    @Override
    public String makePaymentPhone(int transferAmount, String сurrencyMoney, User user, User client, String paymentIdentifier) {
        String result = "";
        System.out.println("Получен запрос от пользователя " + user.getNumberPhone());
        PaymentIndetifierValidation paymentIndetifierValidation = new PaymentIndetifierValidation(paymentIdentifier, listPaymentIdentifier);

        try {
            int numberTransaction = hisoryTransaction.newNumberTransaction();
            paymentIndetifierValidation.checkDoublePaymentPhone();
            listPaymentIdentifier.add(paymentIdentifier);
            PaymentPhone paymentPhone = new PaymentPhone();
            result = paymentPhone.pay(transferAmount, сurrencyMoney, user.getNumberAccount().getNumberAccount(), client.getNumberPhone());
            InfoTransaction infoTransaction = new InfoTransaction(numberTransaction, user.getNumberAccount().getNumberAccount(), client.getNumberPhone(), transferAmount, сurrencyMoney);
            hisoryTransaction.putNumberTransaction(infoTransaction);
        } catch (PaymentIndetifierException e) {
            System.out.println(e);
            System.out.println(e.getPaymentIndetifier());
            throw e;
        }
        return result;
    }
}