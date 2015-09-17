/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

/**
 *
 * @author root
 */
@Entity
public class Fiche_detenteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long N_serie;
    @Column( nullable = false)
    private String designation_materiel;
    @OneToOne
    private Personne personne;
    @ManyToOne
    private Materiel materiel;

    public Long getN_serie() {
        return N_serie;
    }

    public void setN_serie(Long N_serie) {
        this.N_serie = N_serie;
    }

    public String getDesignation_materiel() {
        return designation_materiel;
    }

    public void setDesignation_materiel(String designation_materiel) {
        this.designation_materiel = designation_materiel;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }
    
    
    
}
