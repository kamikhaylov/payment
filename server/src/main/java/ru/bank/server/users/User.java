package ru.bank.server.users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ru.bank.server.users.paymentAttributes.Account;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Entity
@Table(name = "Users")
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue
    private String numberPhone;

    @OneToMany(mappedBy = "user_id")
    private Set<Account> accounts;

    public User(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}