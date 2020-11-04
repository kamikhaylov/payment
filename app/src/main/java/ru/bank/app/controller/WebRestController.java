package ru.bank.app.controller;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.bank.app.application.WebApplication;
import ru.bank.app.exception.WebInternalErrorException;

@RestController
@AllArgsConstructor
@Log
public class WebRestController {

    @GetMapping("/Webs")
    public String getWebsStatus() {
        return "1 Web is ready.";
    }

    @GetMapping("/Webs/{WebId}/users/{userId}/accounts/{accountId}/clients/{clientsId}/transferAmount/{transferAmount}")
    public String makePhonePayment(
            @PathVariable("WebId") Long WebId,
            @PathVariable("userId") String numberPhone,
            @PathVariable("accountId") String accountId,
            @PathVariable("clientsId") String numberPhoneClient,
            @PathVariable("transferAmount") int transferAmount) {

        log.info("userId " + numberPhone + " accountId " + accountId + " clientsId " + numberPhoneClient + " transferAmount " + transferAmount);

        if (WebId != 1) {
            throw new WebInternalErrorException("Web internal Error");
        }

        ApplicationContext context = new AnnotationConfigApplicationContext("ru.bank.app.application");
        WebApplication webApplication = context.getBean(WebApplication.class);

        return webApplication.makePhonePayment(numberPhone, accountId, numberPhoneClient, transferAmount);
    }
}