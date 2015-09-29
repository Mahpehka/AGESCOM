/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Personne;
import com.mycompany.agestcom.service.IPersonneService;
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
public class PersonneBean {
    
 @ManagedProperty(value = "#{IPersonneService}")
    IPersonneService iPersonneService;
    
    Personne personne= new Personne();
  
    public PersonneBean() {
    }

    public IPersonneService getiPersonneService() {
        return iPersonneService;
    }

    public void setiPersonneService(IPersonneService iPersonneService) {
        this.iPersonneService = iPersonneService;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
    
     public Personne createPersonne(){
      return iPersonneService.createPersonne(personne);
    }
    public  Personne updatePersonne(){
      return iPersonneService.updatePersonne(personne);
    }
    public  Personne findFPersonneById(){
      return iPersonneService.findPersonneById(personne.getId());
    }
    public List<Personne> findAllPersonne(){
      return iPersonneService.findAllPersonne();
    }
}
