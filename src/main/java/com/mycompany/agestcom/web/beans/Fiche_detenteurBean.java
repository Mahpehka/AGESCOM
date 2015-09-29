/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Fiche_detenteur;
import com.mycompany.agestcom.service.IFiche_detenteurService;
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
public class Fiche_detenteurBean {

     @ManagedProperty(value = "#{IFiche_detenteurService}")
     IFiche_detenteurService iFiche_detenteurService;
     Fiche_detenteur fiche_detenteur=new Fiche_detenteur();
     
    public Fiche_detenteurBean() {
    }

    public IFiche_detenteurService getiFiche_detenteurService() {
        return iFiche_detenteurService;
    }

    public void setiFiche_detenteurService(IFiche_detenteurService iFiche_detenteurService) {
        this.iFiche_detenteurService = iFiche_detenteurService;
    }

    public Fiche_detenteur getFiche_detenteur() {
        return fiche_detenteur;
    }

    public void setFiche_detenteur(Fiche_detenteur fiche_detenteur) {
        this.fiche_detenteur = fiche_detenteur;
    }
    
 public Fiche_detenteur createFiche_detenteur(){
      return iFiche_detenteurService.createFiche_detenteur(fiche_detenteur);
    }
    public  Fiche_detenteur updateFiche_detenteur(){
      return iFiche_detenteurService.updateFiche_detenteur(fiche_detenteur);
    }
    public Fiche_detenteur  findFiche_detenteurById(){
      return iFiche_detenteurService.findFiche_detenteurById(fiche_detenteur.getId());
    }
     
    public List<Fiche_detenteur> findAllFiche_detenteurs(){
      return iFiche_detenteurService.findAllFiche_detenteurs();
    }    
}
