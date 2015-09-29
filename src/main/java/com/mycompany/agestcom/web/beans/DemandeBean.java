/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Demande;
import com.mycompany.agestcom.service.IDemandeService;
import com.mycompany.agestcom.service.IFournisseurService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author root
 */
@ManagedBean
@Dependent
public class DemandeBean {

     @ManagedProperty(value = "#{IDemandeService}")
     IDemandeService iDemandeService;
    
     Demande demande=new  Demande();
  
    public DemandeBean() {
    }

    public IDemandeService getiDemandeService() {
        return iDemandeService;
    }

    public void setiDemandeService(IDemandeService iDemandeService) {
        this.iDemandeService = iDemandeService;
    }

    public Demande getDemande() {
        return demande;
    }

    public void setDemande(Demande demande) {
        this.demande = demande;
    }
    
        public Demande createDemande(){
      return iDemandeService.createDemande(demande);
    }
    public  Demande updateDemande(){
      return iDemandeService.updateDemande(demande);
    }
    public  Demande findDemandeById(){
      return iDemandeService.findDemandeById(demande.getId());
    }
  
    public List<Demande> findAllDemande(){
      return iDemandeService.findAllDemande();
    }
    
    public String deleteDemande(){
        iDemandeService.deleteDemande(demande.getId());
        return "delete";
    }
}
