package ru.bank.server.users.baseUsers;

import ru.bank.server.users.User;

import java.util.HashMap;
import java.util.Map;


public class BaseUsers {
    private Map<String, User> mapBaseUser = new HashMap<>();

    public void putUser(User user) {
        mapBaseUser.put(user.getNumberPhone(), user);
    }

    public String viewDetailsUser(String numberPhone) {
        return String.valueOf(mapBaseUser.get(numberPhone));
    }
}