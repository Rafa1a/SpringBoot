package com.apirest.springvscode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.springvscode.database.repositoriodata;
import com.apirest.springvscode.modal.PRODUTO;

@RestController
@RequestMapping("/produtos")
public class dadoREST {
    @Autowired
    private repositoriodata repositorio;

    @GetMapping
    public List<PRODUTO> listar() {
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar(@RequestBody PRODUTO data){
        repositorio.save(data);
    }
    @PutMapping
    public void alterar(@RequestBody PRODUTO data){
        if(data.getCOD_PRODUTO()>0)
        repositorio.save(data);
    }
    @DeleteMapping
    public void excluir(@RequestBody PRODUTO data){
        repositorio.delete(data);
    }
}
