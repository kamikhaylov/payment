package ru.bank.server.baseUsers;

import ru.bank.users.User;

import java.util.HashMap;

public class BaseUsers {
    HashMap<String, User> baseUser = new HashMap<>();

    public void putUser(User user) {
        baseUser.put(user.getNumberPhone(), user);
    }

    public void viewDetailsUser(String numberPhone) {
        System.out.println(baseUser.get(numberPhone));
    }

}
