package com.example.MyWebApp.execption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class CustomerNotFoundExecption extends RuntimeException{
    public CustomerNotFoundExecption(String message) {
        super(message);
    }
}
