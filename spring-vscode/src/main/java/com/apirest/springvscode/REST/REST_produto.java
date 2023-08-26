package com.apirest.springvscode.REST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.springvscode.database.repoPRODUTO;
import com.apirest.springvscode.modal.PRODUTO;

@RestController
@RequestMapping("/produtos")
public class REST_produto {

    @Autowired
    private repoPRODUTO repositorio;

    @GetMapping
    public List<PRODUTO> listar() {
        return repositorio.findAll();
    }

}
