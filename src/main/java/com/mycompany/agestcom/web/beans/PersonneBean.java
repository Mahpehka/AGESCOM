/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import com.mycompany.agestcom.data.Division;
import javax.faces.bean.ManagedProperty;
import com.mycompany.agestcom.service.IPersonneService;
import com.mycompany.agestcom.data.Personne;
import com.mycompany.agestcom.service.IDemandeService;
import com.mycompany.agestcom.data.Demande;
import com.mycompany.agestcom.data.Fonction;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author root
 */
@ManagedBean
@RequestScoped
public class PersonneBean {

    @ManagedProperty(value = "#{IPersonneService}")
    IPersonneService iPersonneService;
    @ManagedProperty(value = "#{IDemandeService}")
    private IDemandeService iDemandeService;
    Personne personne = new Personne();
    private List<Demande> listedemandes;
    private List listes;

    Long iddemande;
    private Long tab[];

    public PersonneBean() {
        iddemande = 0L;
        tab = new Long[5];
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

    public Personne createPersonne() {
        personne.setDemandes(listedemandes);
        return iPersonneService.createPersonne(personne);
    }

    public Personne updatePersonne() {
        return iPersonneService.updatePersonne(personne);
    }

    public Personne findPersonneById() {
        return iPersonneService.findPersonneById(personne.getId());
    }

    public List<Personne> findAllPersonne() {
        return  iPersonneService.findAllPersonne();
    }

    public IDemandeService getiDemandeService() {
        return iDemandeService;
    }

    public void setiDemandeService(IDemandeService iDemandeService) {
        this.iDemandeService = iDemandeService;
    }

    public List<Demande> getListedemandes() {
        return listedemandes;
    }

    public void setListedemandes(List<Demande> listedemandes) {
        this.listedemandes = listedemandes;
    }

    public Long getIddemande() {
        return iddemande;
    }

    public void setIddemande(Long iddemande) {
        this.iddemande = iddemande;
    }

    public Long[] getTab() {
        return tab;
    }

    public void setTab(Long[] tab) {
        this.tab = tab;
    }

    public List getDivision() {
        List<Division> result = new ArrayList<Division>();
        result.add(Division.DAAF);
        result.add(Division.DEL);
        result.add(Division.DEP);
        result.add(Division.DIRE);
        result.add(Division.DTB);
        return result;
    }
    
    
    public List getFonction() {
        List<Fonction> resul = new ArrayList<Fonction>();
        resul.add(Fonction.utilisateur);
        resul.add(Fonction.administrateur);
        return resul;
    }
}
