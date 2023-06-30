package ru.netology.authorization.service;

import ru.netology.authorization.domain.Authorities;
import ru.netology.authorization.exceptions.InvalidCredentials;
import ru.netology.authorization.exceptions.UnauthorizedUser;
import ru.netology.authorization.repository.UserRepository;

import java.util.List;

public class AuthorizationService {
    UserRepository userRepository;

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {

        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {

        return str == null || str.isEmpty();
    }
}
