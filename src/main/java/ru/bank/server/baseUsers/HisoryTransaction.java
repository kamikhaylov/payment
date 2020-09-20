package ru.bank.server.baseUsers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HisoryTransaction {
    Map<Integer, InfoTransaction> mapBaseTransaction = new HashMap<>();
    List<Integer> listNumberTransaction = new ArrayList<>();

    public Integer newNumberTransaction() {
        int newNumberTransaction, lastNumbertTransaction;

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

    public void viewDetailsTransaction(int numberTransaction) {
        System.out.println(mapBaseTransaction.get(numberTransaction));
    }
}
