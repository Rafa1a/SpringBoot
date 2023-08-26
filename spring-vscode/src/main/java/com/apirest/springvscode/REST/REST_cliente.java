package com.apirest.springvscode.REST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.springvscode.database.repoCLIENTE;
import com.apirest.springvscode.modal.CLIENTE;

@RestController
@RequestMapping("/clientes")
public class REST_cliente {
    
    @Autowired
    private repoCLIENTE repo;
    
    @GetMapping
    public List<CLIENTE> listar() {
        return repo.findAll();
    }
}
