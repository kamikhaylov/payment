package ru.bank.app.application;

import lombok.Getter;
import lombok.extern.java.Log;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.bank.app.command.GeneratorID;
import ru.bank.app.exception.AccountException;
import ru.bank.app.exception.PhoneException;
import ru.bank.app.validation.ValidatorAccount;
import ru.bank.app.validation.ValidatorPhone;
import ru.bank.common.messages.Request;
import ru.bank.common.users.User;
import ru.bank.common.users.paymentAttributes.Account;
import ru.bank.common.users.paymentAttributes.Сurrency;

@Getter
@Component
@Log
public class WebApplication implements Application {
    private GeneratorID generatorID;

    public WebApplication() {
        this.generatorID = new GeneratorID();
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

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Request> request = new HttpEntity<>(
                new Request(transferAmount, сurrency, user, client,
                        generatorID.generateIndenifier(user.getNumberPhone())));

        log.info("request.toString()" + request.toString());

        ResponseEntity<String> responseEntityStr = restTemplate.
                postForEntity("http://127.0.0.1:9090/servers/1/users/" + user.getNumberPhone(),
                        request, String.class);

        result = "responseEntityStr.getBody()" + responseEntityStr.getBody();
        return result;
    }
}