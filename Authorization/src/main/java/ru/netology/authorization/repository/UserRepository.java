package ru.netology.authorization.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorization.domain.Authorities;
import ru.netology.authorization.domain.User;

import java.util.Collections;
import java.util.List;
@Repository
public class UserRepository {

    private String login;
    private int password;

    public void User(String name, int age) {
        this.login = login;
        this.password = password;
    }

    public static void main(String[] args) {

        User andrey = new User("Andrey", 85649);

    }

    public List<Authorities> getUserAuthorities(String user, String password) {

        return Collections.emptyList();
    }
    private List<User> listUser;
}

