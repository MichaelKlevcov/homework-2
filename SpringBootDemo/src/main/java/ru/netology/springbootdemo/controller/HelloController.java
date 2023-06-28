package ru.netology.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springbootdemo.demain.Person;





@RestController
public class HelloController {
    @Value("${hello.from:underfined}")
    private String from;

    @GetMapping ("/hello")
    private String hello(@RequestBody @Validated Person guest) {
        return String.format("Hello from %s to name %s age %d!",
                from, guest.getName(), guest.getAre());
    }
}
