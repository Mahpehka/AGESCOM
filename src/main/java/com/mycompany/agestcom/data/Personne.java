/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author root
 */
@Entity

@NamedQueries({
@NamedQuery(name = "Personne.findByLogin",query = " SELECT p from Personne p   WHERE p.login = :param"),
@NamedQuery(name = "Personne.findByPassword",query = " SELECT p from Personne p   WHERE p.password = :param"),
})
    public class Personne implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column( nullable = false)
    private String matricule;
    @Column( nullable = false)
    private String nom;
    @Column( nullable = false)
    private String Prenom;
    @Column( nullable = true)
    private  Fonction fonction;
    @Column( nullable = false)
    private Division division;
    @Column( nullable = false, unique = true)
    private  String login;
    @Column( nullable = false, unique = true)
    private   String password;
    @OneToOne(mappedBy = "personne")
    private Fiche_detenteur fiche_detenteur;
    @OneToMany(mappedBy = "personne")
    private List<Demande> demandes;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

   
    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

   
    


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Fiche_detenteur getFiche_detenteur() {
        return fiche_detenteur;
    }

    public void setFiche_detenteur(Fiche_detenteur fiche_detenteur) {
        this.fiche_detenteur = fiche_detenteur;
    }

    public List<Demande> getDemandes() {
        return demandes;
    }

    public void setDemandes(List<Demande> demandes) {
        this.demandes = demandes;
    }

   
   

  

   
    
    
    
}
