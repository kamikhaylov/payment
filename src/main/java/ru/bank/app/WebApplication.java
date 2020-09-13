package ru.bank.app;

import lombok.Getter;
import ru.bank.app.validation.NumberPhoneValidation;
import ru.bank.command.CommandServerInput;
import ru.bank.exception.app.NumberPhoneException;
import ru.bank.server.BankServer;
import ru.bank.users.User;

import java.util.ArrayList;

@Getter
public class WebApplication implements Application {
    ArrayList<String> listPaymentIndentifier = new ArrayList<String>();
    private String paymentIdentifier;

    public WebApplication() {
    }

    public void makePaymentPhone(int transferAmount, String currencyMoney, User user, User client, BankServer bankServer) {
        NumberPhoneValidation numberPhoneValidation = new NumberPhoneValidation(client.getNumberPhone());
        try {
            numberPhoneValidation.checkPrefix().checkLength().checkAllNumber();
            generateIndenifier(user.getNumberPhone());
            CommandServerInput commandServerInput = new CommandServerInput();
            commandServerInput.execute(transferAmount, currencyMoney, user, client, bankServer, paymentIdentifier);

//            Эмитация повторного запроса
//            commandServerInput.execute(transferAmount, currencyMoney, user, client, bankServer, "90011111110");

        } catch (NumberPhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
        }
    }

    public void generateIndenifier(String numberPhone) {
        String number = numberPhone.substring(2);
        int ID = 0;
        paymentIdentifier = number + ID;
        for (String list : listPaymentIndentifier) {
            if (list.equals(paymentIdentifier)) {
                ID++;
                paymentIdentifier = number + ID;
            }
        }
        listPaymentIndentifier.add(paymentIdentifier);
        System.out.println("Персональный индетификатор платежа сгенерирован: " + paymentIdentifier);
    }
}
