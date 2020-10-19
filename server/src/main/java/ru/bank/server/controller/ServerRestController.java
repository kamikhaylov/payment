package ru.bank.server.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.bank.common.messages.Request;
import ru.bank.common.messages.Response;
import ru.bank.common.users.baseUsers.BaseUsers;
import ru.bank.common.users.baseUsers.HisoryTransaction;
import ru.bank.server.server.BankServer;

import java.util.ArrayList;

@RestController
@AllArgsConstructor
public class ServerRestController {

    @GetMapping("/Servers")
    public String getServerStatus() {
        return "1 Server is ready.";
    }

    @PostMapping("/servers/{serverId}/users/{userId}")
    public Response getBalance(@PathVariable("serverId") Long serverId,
                               @PathVariable("userId") String numberPhone,
                               @RequestBody Request request) {

        BankServer bankServer = new BankServer(new ArrayList<String>(), new BaseUsers(), new HisoryTransaction());
        bankServer.getBaseUsers().putUser(request.getUser());

        Response response = new Response(bankServer.makePhonePayment(request.getTransferAmount(),
                request.getСurrency(), request.getUser(), request.getClient(), request.getPaymentIdentifier()));

        return response;
    }
}
