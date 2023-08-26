package com.apirest.springvscode.REST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroler {
    @GetMapping(value="/")
    public String getMethodName() {
        return "Ola Mundo !";
    }
    
}
