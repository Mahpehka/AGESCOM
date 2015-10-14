/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author root
 */
@ManagedBean
@RequestScoped
public class OrientationBean {

    /**
     * Creates a new instance of OrientationBean
     */
    public OrientationBean() {
    }
    public String accueil(){
        return "accueil";
    }
    
    public  String fournisseur(){
        return "fournisseur";
    }
    
    public  String Materiel(){
        return "Materiel";
    }
    
    public String Demande(){
        return "Demande";
    }
    
    public  String Commande(){
        return "Commande";
    }
    
    public String Fiche_detenteur(){
    
        return "Fiche_detenteur";
    }
    
    public  String Livraison(){
        return "livraison";
    }
    
    public String Personne(){
        return "Personne";
    }
    
    public  String Reforme(){
        return "reforme";
    }
    
    public  String Cession(){
        return "Cession";
    }
    public  String listesMako(){
        return "listes";
    }
}
