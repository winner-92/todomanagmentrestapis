package com.example.todo_managment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourcNotFoundException extends RuntimeException {


    public ResourcNotFoundException(String message) {
        super(message);
    }
}
