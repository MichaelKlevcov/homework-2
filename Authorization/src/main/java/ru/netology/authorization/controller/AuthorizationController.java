package ru.netology.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springbootdemo.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Author> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}
