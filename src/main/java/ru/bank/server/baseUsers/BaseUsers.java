package ru.bank.server.baseUsers;

import ru.bank.users.User;

import java.util.HashMap;
import java.util.Map;

public class BaseUsers {
    Map<String, User> mapBaseUser = new HashMap<>();

    public void putUser(User user) {
        mapBaseUser.put(user.getNumberPhone(), user);
    }

    public void viewDetailsUser(String numberPhone) {
        System.out.println(mapBaseUser.get(numberPhone));
    }
}