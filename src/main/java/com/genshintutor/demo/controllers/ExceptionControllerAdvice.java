package com.genshintutor.demo.controllers;

import com.genshintutor.demo.exceptions.UnauthorizedException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler({UnauthorizedException.class})
    public String handleUnauthorizedException(Model model) {
        return "unauthorized";
    }
}

