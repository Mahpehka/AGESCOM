/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;

/**
 *
 * @author root
 */@Entity
public class Reforme extends Sortie implements Serializable{
    @Column( nullable = false)
    private String description;
     @ManyToOne
    private Materiel materiel;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }
    
    
}
