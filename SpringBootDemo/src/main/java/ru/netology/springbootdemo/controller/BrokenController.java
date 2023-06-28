package ru.netology.springbootdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ru.netology.springbootdemo.demain.Person;
import javax.sound.midi.Patch;

@RestController
@RequestMapping ("/error")
public class BrokenController {
    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable("id") long id) {
        try {
            throw new IllegalArgumentException("IllegalArgumentException");
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ResponseStatusException", e);
        }
    }





    @GetMapping("/iae")
    public Person throwExwption() {
            throw new IllegalArgumentException("IllegalArgumentException");
    }


    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> iaeHandler(IllegalArgumentException e) {
        
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> reHandler() {

    }
}