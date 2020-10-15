package ru.bank.app.service;

import org.springframework.stereotype.Service;
import ru.bank.app.application.WebApplication;

@Service
public class WebService {
    public WebApplication makePhonePayment() {
        return new WebApplication();
    }
}