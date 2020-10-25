package ru.bank.server.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.bank.server.users.User;

@Repository
public interface UserCrudRepository extends CrudRepository<User, String> {
}
