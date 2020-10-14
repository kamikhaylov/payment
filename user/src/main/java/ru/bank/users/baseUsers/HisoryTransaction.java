package ru.bank.users.baseUsers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HisoryTransaction {
    private Map<Integer, InfoTransaction> mapBaseTransaction = new HashMap<>();
    private List<Integer> listNumberTransaction = new ArrayList<>();

    public Integer newNumberTransaction() {
        int newNumberTransaction;
        int lastNumbertTransaction;

        if (listNumberTransaction.size() == 0) {
            int numberTransaction = 0;
            listNumberTransaction.add(numberTransaction);
        }

        lastNumbertTransaction = listNumberTransaction.get(listNumberTransaction.size() - 1);
        newNumberTransaction = lastNumbertTransaction + 1;
        listNumberTransaction.add(newNumberTransaction);
        return newNumberTransaction;
    }

    public void putNumberTransaction(InfoTransaction infoTransaction) {
        mapBaseTransaction.put(infoTransaction.getNumberTransaction(), infoTransaction);
    }

    public String viewDetailsTransaction(int numberTransaction) {
        return String.valueOf(mapBaseTransaction.get(numberTransaction));
    }
}