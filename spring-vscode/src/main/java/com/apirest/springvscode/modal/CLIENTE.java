package com.apirest.springvscode.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * CLIENTE
 */
@Entity
public class CLIENTE {

    @Id
    @Column(nullable = false)
    private String CEP;
    @Column(nullable = false)
    private String NOME;
    @Column(nullable = false)
    private int COD_PRODUTO;
    
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String cEP) {
        CEP = cEP;
    }
    public String getNOME() {
        return NOME;
    }
    public void setNOME(String nOME) {
        NOME = nOME;
    }
    public int getCOD_PRODUTO() {
        return COD_PRODUTO;
    }
    public void setCOD_PRODUTO(int cOD_PRODUTO) {
        COD_PRODUTO = cOD_PRODUTO;
    }
    
    
}