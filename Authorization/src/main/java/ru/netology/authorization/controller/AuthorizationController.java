package ru.netology.authorization.controller;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.authorization.domain.Authorities;
import ru.netology.authorization.domain.User;
import ru.netology.authorization.service.AuthorizationService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        User User = null;
        return service.getAuthorities(User);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response> handler(Exception e) {
        return null;
    }
}



