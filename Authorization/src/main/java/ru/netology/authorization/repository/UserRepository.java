package ru.netology.authorization.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorization.domain.Authorities;
import ru.netology.authorization.domain.User;

import java.util.Collections;
import java.util.List;
@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return Collections.emptyList();
    }
    private List<User> listUse;
}


