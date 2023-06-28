package ru.netology.springbootdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ru.netology.springbootdemo.demain.Person;

@RestController
@RequestMapping("/another")
public class AnotherBrokenController {


    @GetMapping("/iae")
    public String throwException() {
        throw new IllegalArgumentException("throwException");
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> reHandler(RuntimeException e) {
        return new ResponseEntity<>("RuntimeException in throwException method", HttpStatus.I_AM_A_TEAPOT);
    }
}