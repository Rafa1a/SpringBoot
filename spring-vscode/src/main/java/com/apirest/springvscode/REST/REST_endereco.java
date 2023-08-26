package com.apirest.springvscode.REST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.springvscode.database.repoENDERECO;
import com.apirest.springvscode.modal.ENDERECO;

@RestController
@RequestMapping("/enderecos")
public class REST_endereco {
    
    @Autowired
    private repoENDERECO repo;
    @GetMapping
    public List<ENDERECO> listar() {
        return repo.findAll();
    }
}
