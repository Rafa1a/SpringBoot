package com.apirest.springvscode.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.springvscode.modal.PRODUTO;

public interface repoPRODUTO extends JpaRepository<PRODUTO,Integer> {
    
}
