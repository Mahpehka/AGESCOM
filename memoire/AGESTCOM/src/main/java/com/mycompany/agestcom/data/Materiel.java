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
    @OneToMany
    private List<Demande> demandes;
    @OneToMany
    private List<Reforme> reformes;
    @OneToMany
    private List<Cession> cessions;
    @OneToMany
    private List<Fiche_detenteur> fiche_detenteurs;

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

    public List<Demande> getDemandes() {
        return demandes;
    }

    public void setDemandes(List<Demande> demandes) {
        this.demandes = demandes;
    }

  
    public List<Reforme> getReformes() {
        return reformes;
    }

    public void setReformes(List<Reforme> reformes) {
        this.reformes = reformes;
    }

    public List<Cession> getCessions() {
        return cessions;
    }

    public void setCessions(List<Cession> cessions) {
        this.cessions = cessions;
    }

   
    public List<Fiche_detenteur> getFiche_detenteurs() {
        return fiche_detenteurs;
    }

    public void setFiche_detenteurs(List<Fiche_detenteur> fiche_detenteurs) {
        this.fiche_detenteurs = fiche_detenteurs;
    }
    
    
    
}
