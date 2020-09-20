package ru.bank.command;

import java.util.ArrayList;
import java.util.List;

public class GenerateIndenifier {
    List<String> listPaymentIndentifier = new ArrayList<String>();
    private String identifier;

    public String generateIndenifier(String numberPhone) {
        String number = numberPhone.substring(2);
        int ID = 0;
        identifier = number + ID;
        for (String list : listPaymentIndentifier) {
            if (list.equals(identifier)) {
                ID++;
                identifier = number + ID;
            }
        }
        listPaymentIndentifier.add(identifier);
        return identifier;
    }
}
