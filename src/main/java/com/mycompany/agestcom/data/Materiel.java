/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author root
 */
@Entity
public class Materiel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column( nullable = false)
    private  String designation;
    @Column( nullable = false)
    private String N_serie;
    @Column( nullable = false)
    private  String type;
  
    @ManyToOne
    private Sortie sortie;
   
    @ManyToOne
    private Demande demande;
    
    @ManyToOne
    private Fiche_detenteur fiche_detenteur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getN_serie() {
        return N_serie;
    }

    public void setN_serie(String N_serie) {
        this.N_serie = N_serie;
    }

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Demande getDemande() {
        return demande;
    }

    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    public Sortie getSortie() {
        return sortie;
    }

    public void setSortie(Sortie sortie) {
        this.sortie = sortie;
    }

  
    public Fiche_detenteur getFiche_detenteur() {
        return fiche_detenteur;
    }

    public void setFiche_detenteur(Fiche_detenteur fiche_detenteur) {
        this.fiche_detenteur = fiche_detenteur;
    }

   
   
    
    
    
}
