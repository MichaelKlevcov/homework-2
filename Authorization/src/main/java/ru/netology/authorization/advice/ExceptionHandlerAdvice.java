package ru.netology.authorization.advice;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionHandlerAdvice {
}

@ExceptionHandler(Exception.class)
    public ResponseEntity<Response> handler(Exception e) {
        return null;
    }
}
