package ru.bank.server.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.bank.common.messages.Request;
import ru.bank.common.messages.Response;
import ru.bank.common.users.baseUsers.BaseUsers;
import ru.bank.common.users.baseUsers.HisoryTransaction;
import ru.bank.server.server.BankServer;
import ru.bank.server.service.PaymentService;

import java.util.ArrayList;

@RestController
@AllArgsConstructor
public class ServerRestController {

    private PaymentService paymentService;

    @PostMapping("/servers/{serverId}/users/{userId}")
    public Response getBalance(@PathVariable("serverId") Long serverId,
                               @PathVariable("userId") String numberPhone,
                               @RequestBody Request request) {

        // Инициализируется сервер для проведения оплаты
        BankServer bankServer = new BankServer(new ArrayList<String>(), new BaseUsers(), new HisoryTransaction());
        // Добавление пользователя в базу данных на сервере
        bankServer.getBaseUsers().putUser(request.getUser());

        Response response = new Response(bankServer.makePhonePayment(request.getTransferAmount(),
                request.getСurrency(), request.getUser(), request.getClient(), request.getPaymentIdentifier()));

        return response;
    }
}
