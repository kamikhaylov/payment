package ru.bank.server;

import lombok.Getter;
import lombok.ToString;
import ru.bank.command.PaymentPhone;
import ru.bank.exception.server.PaymentIndetifierException;
import ru.bank.server.baseUsers.BaseUsers;
import ru.bank.server.validation.PaymentIndetifierValidation;
import ru.bank.users.User;

import java.util.ArrayList;

@Getter
@ToString
public class BankServer implements Server {
    ArrayList<String> listPaymentIdentifier = new ArrayList<String>();
    private String ip;
    private String port;
    private String protocol;
    private String server;

    BaseUsers baseUsers = new BaseUsers();

    public BankServer(String ip, String port, String protocol, String server) {
        this.ip = ip;
        this.port = port;
        this.protocol = protocol;
        this.server = server;
    }

    public void makePaymentPhone(int transferAmount, String сurrencyMoney, User user, User client, String paymentIdentifier) {
        System.out.println("Получен запрос от пользователя " + user.getNumberPhone());
        PaymentIndetifierValidation paymentIndetifierValidation = new PaymentIndetifierValidation(paymentIdentifier, listPaymentIdentifier);

        try {
            paymentIndetifierValidation.checkDoublePaymentPhone();
            listPaymentIdentifier.add(paymentIdentifier);
            PaymentPhone paymentPhone = new PaymentPhone();
            paymentPhone.pay(transferAmount, сurrencyMoney, user.getNumberAccount().getNumberAccount(), client.getNumberPhone());
        } catch (PaymentIndetifierException e) {
            System.out.println(e);
            System.out.println(e.getPaymentIndetifier());
        }
    }

    public void viewDetailsUser(String numberPhone) {
    }
}
