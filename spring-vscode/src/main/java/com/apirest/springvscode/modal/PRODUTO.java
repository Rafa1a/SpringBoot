package com.apirest.springvscode.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;

@Entity
public class PRODUTO {
    
    @Id
    @GeneratedValue
    private int COD_PRODUTO;
    @Column(nullable = false)
    private String NOME;
    private int QUANTIDADE;
    private float PRECOVENDA;

    public int getCOD_PRODUTO() {
        return COD_PRODUTO;
    }
    public void setCOD_PRODUTO(int cOD_PRODUTO) {
        COD_PRODUTO = cOD_PRODUTO;
    }
    public String getNOME() {
        return NOME;
    }
    public void setNOME(String nOME) {
        NOME = nOME;
    }
    public int getQUANTIDADE() {
        return QUANTIDADE;
    }
    public void setQUANTIDADE(int qUANTIDADE) {
        QUANTIDADE = qUANTIDADE;
    }
    public float getPRECOVENDA() {
        return PRECOVENDA;
    }
    public void setPRECOVENDA(float pRECOVENDA) {
        PRECOVENDA = pRECOVENDA;
    }   
}
