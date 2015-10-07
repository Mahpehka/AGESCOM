/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author root
 */
@Entity
public class Commande implements  Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, nullable = false)
    private Long N_commande;
    @Column( nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date_commande;
    @Column( nullable = false)
    private Long N_ordre_entree;
    @Column( nullable = false)
    private int quantite;
    @OneToMany
    private List<Livraison> livraisons;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getN_commande() {
        return N_commande;
    }

    public void setN_commande(Long N_commande) {
        this.N_commande = N_commande;
    }

    public Date getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(Date date_commande) {
        this.date_commande = date_commande;
    }

    public Long getN_ordre_entree() {
        return N_ordre_entree;
    }

    public void setN_ordre_entree(Long N_ordre_entree) {
        this.N_ordre_entree = N_ordre_entree;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }


    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public List<Livraison> getLivraisons() {
        return livraisons;
    }

    public void setLivraisons(List<Livraison> livraisons) {
        this.livraisons = livraisons;
    }

     
    
}
