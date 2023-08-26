package com.apirest.springvscode.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ENDERECO {
    @Id
    @Column(nullable = false)
    private String CEP;
    @Column(nullable = false)
    private String RUA;
    
    
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String cEP) {
        CEP = cEP;
    }
    public String getRUA() {
        return RUA;
    }
    public void setRUA(String rUA) {
        RUA = rUA;
    }
    
}
