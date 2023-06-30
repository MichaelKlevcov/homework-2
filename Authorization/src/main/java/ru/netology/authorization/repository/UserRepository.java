package ru.netology.authorization.repository;

import ru.netology.authorization.domain.Authorities;

import java.util.List;

public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return ...;
    }
}
