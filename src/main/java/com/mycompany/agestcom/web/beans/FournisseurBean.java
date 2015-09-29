/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Fournisseur;
import com.mycompany.agestcom.service.IFournisseurService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author root
 */
@ManagedBean
@Dependent
public class FournisseurBean {

     @ManagedProperty(value = "#{IFournisseurService}")
     IFournisseurService iFournisseurService;
    
     Fournisseur fournisseur = new Fournisseur();
    
    public FournisseurBean() {
    }

    public IFournisseurService getiFournisseurService() {
        return iFournisseurService;
    }

    public void setiFournisseurService(IFournisseurService iFournisseurService) {
        this.iFournisseurService = iFournisseurService;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }
    
    public Fournisseur createFournisseur(){
      return iFournisseurService.createFournisseur(fournisseur);
    }
    public  Fournisseur updateFournisseur(){
      return iFournisseurService.updateFournisseur(fournisseur);
    }
    public  Fournisseur findFournisseurById(){
      return iFournisseurService.findFournisseurById(fournisseur.getId());
    }
    
    public List<Fournisseur> findFournisseur(){
      return iFournisseurService.findAllFournisseurs();
    }
    
     public String deleteFournisseur(){
        iFournisseurService.deleteFournisseur(fournisseur.getId());
        return "supprimer";
}
}
