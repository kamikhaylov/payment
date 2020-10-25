package ru.bank.app.application;

import lombok.Getter;
import lombok.extern.java.Log;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.bank.app.command.GeneratorID;
import ru.bank.app.exception.PhoneException;
import ru.bank.app.validation.ValidatorPhone;
import ru.bank.common.messages.Request;

@Getter
@Component
@Log
public class WebApplication implements Application {
    private GeneratorID generatorID;

    public WebApplication() {
        this.generatorID = new GeneratorID();
    }

    @Override
    public String makePhonePayment(String numberPhone, String account, String numberPhoneClient, int transferAmount) {
        String result = "Ошибка при выполнении";
        ValidatorPhone numberPhoneValidation = new ValidatorPhone(numberPhone);

        try {
            numberPhoneValidation.checkPrefix().checkLength().checkAllNumber();
        } catch (PhoneException e) {
            System.out.println(e);
            System.out.println(e.getNumberPhone());
            throw e;
        }

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Request> request = new HttpEntity<>(
                new Request(numberPhone, account, numberPhoneClient, transferAmount,
                        generatorID.generateIndenifier(numberPhone)));

        log.info("request.toString()" + request.toString());

        ResponseEntity<String> responseEntityStr = restTemplate.
                postForEntity("http://127.0.0.1:9090/servers/1/users/" + numberPhone,
                        request, String.class);

        result = "responseEntityStr.getBody()" + responseEntityStr.getBody();
        return result;
    }
}