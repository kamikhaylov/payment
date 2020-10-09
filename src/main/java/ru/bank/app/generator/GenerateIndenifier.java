package ru.bank.app.generator;

import java.util.ArrayList;
import java.util.List;

public class GenerateIndenifier {
    private List<String> listPaymentIndentifier = new ArrayList<String>();
    private String identifier;

    public String generateIndenifier(String numberPhone) {
        String number = numberPhone.substring(2);
        int id = 0;
        identifier = number + id;
        for (String list : listPaymentIndentifier) {
            if (list.equals(identifier)) {
                id++;
                identifier = number + id;
            }
        }
        listPaymentIndentifier.add(identifier);
        return identifier;
    }
}
