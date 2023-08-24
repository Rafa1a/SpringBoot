package com.apirest.springvscode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroler {
    @GetMapping(value="/")
    public String getMethodName() {
        return "Ola Mundo !";
    }
    
}
