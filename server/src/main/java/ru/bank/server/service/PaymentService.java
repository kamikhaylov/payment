package ru.bank.server.service;

import org.springframework.stereotype.Service;
import ru.bank.common.users.baseUsers.BaseUsers;
import ru.bank.common.users.baseUsers.HisoryTransaction;
import ru.bank.server.server.BankServer;

import java.util.ArrayList;

@Service
public class PaymentService {
    public BankServer makePhonePayment() {
        return new BankServer(new ArrayList<String>(), new BaseUsers(), new HisoryTransaction());
    }
}
