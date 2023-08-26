package com.apirest.springvscode.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.apirest.springvscode.modal.CLIENTE;
//import com.apirest.springvscode.modal.ENDERECO;

public interface repoCLIENTE extends JpaRepository<CLIENTE,String>{
    @Query("SELECT e FROM CLIENTE e WHERE e.CEP = :cep")
    CLIENTE findByCep(@Param("cep") String cep);
}
