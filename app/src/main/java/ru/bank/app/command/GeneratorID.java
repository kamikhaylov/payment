package ru.bank.app.command;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class GeneratorID {
    private List<String> listPaymentID = new ArrayList<String>();
    private String identifier;

    public String generateIndenifier(String numberPhone) {
        String number = numberPhone.substring(2);
        AtomicInteger id = new AtomicInteger();
        identifier = number + id;

        listPaymentID.forEach(list -> {
            if (list.equals(identifier)) {
                id.getAndIncrement();
                identifier = number + id;
            }
        });

        listPaymentID.add(identifier);
        return identifier;
    }
}
