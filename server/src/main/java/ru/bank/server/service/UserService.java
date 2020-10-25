package ru.bank.server.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.bank.server.repository.UserCrudRepository;
import ru.bank.server.users.AccountDTO;
import ru.bank.server.users.User;
import ru.bank.server.users.UserDTO;
import ru.bank.server.users.paymentAttributes.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class UserService {
    private UserCrudRepository userCrudRepository;

    public List<UserDTO> getAllUsers() {
        Iterable<User> userIterable = userCrudRepository.findAll();
        List<UserDTO> users = new ArrayList<>();

        userIterable.forEach(
                user -> {
                    Set<Account> accountSet = user.getAccounts();
                    List<AccountDTO> accountDTOSet = new ArrayList<>();

                    for (Account account : accountSet) {
                        accountDTOSet.add(new AccountDTO(account.getNumberPhone().toString(),
                                account.getAccount(), account.getAmount(), account.getСurrency()));
                    }
                    users.add(new UserDTO(user.getNumberPhone(), accountDTOSet));
                }
        );
        return users;
    }
}
