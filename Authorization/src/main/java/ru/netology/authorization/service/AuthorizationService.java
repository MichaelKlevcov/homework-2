package ru.netology.authorization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.authorization.domain.Authorities;
import ru.netology.authorization.domain.User;
import ru.netology.authorization.exceptions.InvalidCredentials;
import ru.netology.authorization.exceptions.UnauthorizedUser;
import ru.netology.authorization.repository.UserRepository;

import java.util.List;

@Service
public class AuthorizationService {

    UserRepository UserRepository;

    public String getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        String userAuthorities = UserRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {

        return str == null || str.isEmpty();
    }


    public List<Authorities> getAuthorities(User user) {
        return null;
    }
}
