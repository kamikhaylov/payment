package ru.bank.server.users;

import lombok.Value;

import java.util.List;

@Value
public class UserDTO {

    private final String numberPhone;
    private final List<AccountDTO> accountDTO;

}
