package ru.netology.authorization.domain;

import java.util.List;

public class User {
    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public static void main(String[] args) {
        User Andrey = new User("Andrey", 457836);
        System.out.println(Andrey.login);
        System.out.println(Andrey.password);
    }

    private String login;
    private int password;
    private List<Authorities> listAuthorities;
}
