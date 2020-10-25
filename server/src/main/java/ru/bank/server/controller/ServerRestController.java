package ru.bank.server.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.bank.common.messages.Request;
import ru.bank.common.messages.Response;
import ru.bank.server.exception.AccountException;
import ru.bank.server.server.BankServer;
import ru.bank.server.service.UserService;
import ru.bank.server.users.User;
import ru.bank.server.users.UserDTO;
import ru.bank.server.users.baseUsers.BaseUsers;
import ru.bank.server.users.baseUsers.HisoryTransaction;
import ru.bank.server.users.paymentAttributes.Account;
import ru.bank.server.users.paymentAttributes.AccountIndividual;
import ru.bank.server.users.paymentAttributes.Сurrency;
import ru.bank.server.validation.ValidatorAccount;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class ServerRestController {

    private UserService userService;

    @GetMapping("/Servers")
    public String getServerStatus() {
        return "1 Server is ready.";
    }

    @GetMapping("/Servers/users/all")
    public List<UserDTO> getUsersInfo() {
        return userService.getAllUsers();
    }


    @PostMapping("/servers/{serverId}/users/{userId}")
    public Response getPayment(@PathVariable("serverId") Long serverId,
                               @PathVariable("userId") String numberPhone,
                               @RequestBody Request request) {

        Account debitAccountNumberUser = new AccountIndividual(request.getAccount(), 500000000, Сurrency.RUB);
        User user = new User(request.getNumberPhone());
        User client = new User(request.getNumberPhoneClient());

        BankServer bankServer = new BankServer(new ArrayList<String>(), new BaseUsers(), new HisoryTransaction());
        bankServer.getBaseUsers().putUser(user);

        ValidatorAccount<Account> validatorAccount = new ValidatorAccount<>(debitAccountNumberUser);
        try {
            validatorAccount.checkLength().checkAllNumber();
        } catch (AccountException e) {
            System.out.println(e);
            System.out.println(e.getNumberAccount());
            throw e;
        }

        Response response = new Response(bankServer.makePhonePayment(request.getTransferAmount(),
                Сurrency.RUB, user, debitAccountNumberUser, client, request.getPaymentIdentifier()));

        return response;
    }
}
