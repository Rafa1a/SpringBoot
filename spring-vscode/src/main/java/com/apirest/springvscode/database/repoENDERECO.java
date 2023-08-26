package com.apirest.springvscode.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.apirest.springvscode.modal.ENDERECO;

public interface repoENDERECO extends JpaRepository<ENDERECO,String> {
    @Query("SELECT e FROM ENDERECO e WHERE e.CEP = :cep")
    ENDERECO findByCep(@Param("cep") String cep);
}
