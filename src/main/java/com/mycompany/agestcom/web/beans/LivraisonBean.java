/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Commande;
import com.mycompany.agestcom.data.Fournisseur;
import com.mycompany.agestcom.data.Livraison;
import com.mycompany.agestcom.service.ILivraisonService;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author root
 */

@ManagedBean
@RequestScoped
public class LivraisonBean {

    @ManagedProperty(value = "#{ILivraisonService}")
    ILivraisonService iLivraisonService;
    Livraison livraison= new Livraison();
    private Long tab[];

    private List<Fournisseur> listeFournisseurs;
    private List<Commande> listeCommandes;
    Long idfournisseur;
    Long idcommande;
    private Date date;
    
    public LivraisonBean() {
        idfournisseur= 0L;
        idcommande= 0L;
        tab= new Long[5];
         
    }

    public ILivraisonService getiLivraisonService() {
        return iLivraisonService;
    }

    public void setiLivraisonService(ILivraisonService iLivraisonService) {
        this.iLivraisonService = iLivraisonService;
    }

    public Livraison getLivraison() {
        return livraison;
    }

    public void setLivraison(Livraison livraison) {
        this.livraison = livraison;
    }

    public Long[] getTab() {
        return tab;
    }

    public void setTab(Long[] tab) {
        this.tab = tab;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    public List<Fournisseur> getListeFournisseurs() {
        return listeFournisseurs;
    }

    public void setListeFournisseurs(List<Fournisseur> listeFournisseurs) {
        this.listeFournisseurs = listeFournisseurs;
    }

    public List<Commande> getListeCommandes() {
        return listeCommandes;
    }

    public void setListeCommandes(List<Commande> listeCommandes) {
        this.listeCommandes = listeCommandes;
    }

    public Long getIdfournisseur() {
        return idfournisseur;
    }

    public void setIdfournisseur(Long idfournisseur) {
        this.idfournisseur = idfournisseur;
    }

    public Long getIdcommande() {
        return idcommande;
    }

    public void setIdcommande(Long idcommande) {
        this.idcommande = idcommande;
    }
    
    
    
    public Livraison createLivraison(){
      livraison.setDate_livraison(new Date());
      livraison.setStatus_livraison(0);
      return iLivraisonService.createLivraison(livraison);
    }
    public Livraison updateLivraison(){
      livraison.setStatus_livraison(1);
      livraison.setDate_livraison(new Date());  
      return iLivraisonService.updateLivraison(livraison);
    }
    public  Livraison findFLivraisonById(){
      return iLivraisonService.findLivraisonById(livraison.getId());
    }
    public List<Livraison> findAllLivraison(){
      return iLivraisonService.findAllLivraison();
    }
}
