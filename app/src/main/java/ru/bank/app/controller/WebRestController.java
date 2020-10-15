package ru.bank.app.controller;

import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.bank.app.application.WebApplication;
import ru.bank.app.service.WebService;
import ru.bank.common.users.User;
import ru.bank.common.users.paymentAttributes.Account;
import ru.bank.common.users.paymentAttributes.AccountIndividual;
import ru.bank.common.users.paymentAttributes.Сurrency;

@RestController
@AllArgsConstructor
public class WebRestController {

    private WebService webService;

    @GetMapping("/Webs")
    public String getWebsStatus() {
        return "1 Web is ready.";
    }

    @GetMapping("/Webs/{WebId}/users/{userId}/accounts/{accountId}/clients/{clientsId}")
    public String makePhonePayment(
            @PathVariable("WebId") Long WebId,
            @PathVariable("userId") String numberPhone,
            @PathVariable("accountId") String accountId,
            @PathVariable("clientsId") String numberPhoneClient) {

        Account debitAccountNumberUser = new AccountIndividual(accountId, 500000000, Сurrency.RUB);
        User user = new User(numberPhone, debitAccountNumberUser);
        User client = new User(numberPhoneClient);

        ApplicationContext context = new AnnotationConfigApplicationContext("ru.bank.app.application");
        WebApplication webApplication = context.getBean(WebApplication.class);

        return webApplication.makePhonePayment(1000, Сurrency.RUB, user, client);
    }
}