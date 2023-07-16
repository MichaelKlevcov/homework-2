package ru.netology.authorization.domain;

import java.util.List;

public class User {


    public String login;
    public int password;
    private List<Authorities> listAuthorities;

    public User(String login, int password) {
    }
}
