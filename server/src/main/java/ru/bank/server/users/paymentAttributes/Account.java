package ru.bank.server.users.paymentAttributes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ru.bank.server.users.User;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "Accounts")
@Getter
@Setter
@ToString
public class Account {

    @Id
    @GeneratedValue
    private String numberPhone;

    private String account;
    private int amount;

    @Enumerated(EnumType.STRING)
    private Сurrency сurrency;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user_id;

    public Account(String account, int amount, Сurrency сurrency) {
        this.account = account;
        this.amount = amount;
        this.сurrency = сurrency;
    }
}