/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Commande;
import com.mycompany.agestcom.data.Livraison;
import com.mycompany.agestcom.service.ICommandeService;
import com.mycompany.agestcom.service.ILivraisonService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author root
 */
@ManagedBean
@RequestScoped
public class CommandeBean {
    
     @ManagedProperty(value = "#{ICommandeService}")
     ICommandeService iCommandeService;
     
     @ManagedProperty(value = "#{ILivraisonService}")
    private ILivraisonService iLivraisonService;
            
    
    private Commande commande = new Commande();
    
    private Commande commandeChoisi = new Commande();
    
    private List<Livraison> listeLivraisons;
    
     private Date date_commande;
     private  List listes;
    
    Long idlivraison;
    private Long tab [];
     
      public CommandeBean() {
        idlivraison = 0L;
        tab = new Long[5];
        
    }

    public Date getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(Date date_commande) {
        this.date_commande = date_commande;
    }

  
      
    public ICommandeService getiCommandeService() {
        return iCommandeService;
    }

    public void setiCommandeService(ICommandeService iCommandeService) {
        this.iCommandeService = iCommandeService;
    }

    public ILivraisonService getiLivraisonService() {
        return iLivraisonService;
    }

    public void setiLivraisonService(ILivraisonService iLivraisonService) {
        this.iLivraisonService = iLivraisonService;
    }

    public Long getIdlivraison() {
        return idlivraison;
    }

    public void setIdlivraison(Long idlivraison) {
        this.idlivraison = idlivraison;
    }

    public Long[] getTab() {
        return tab;
    }

    public void setTab(Long[] tab) {
        this.tab = tab;
    }
  

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Commande getCommandeChoisi() {
        return commandeChoisi;
    }

    public void setCommandeChoisi(Commande commandeChoisi) {
        this.commandeChoisi = commandeChoisi;
    }

    public List getListes() {
        return listes;
    }

    public void setListes(List listes) {
        this.listes = listes;
    }

    public void setListeLivraisons(List<Livraison> listeLivraisons) {
        this.listeLivraisons = listeLivraisons;
    }
    
    
    
     public Commande createCommande(){
      commande.setDate_commande(new Date());
      listes=new  ArrayList<Livraison>();
        for(int i = 0; i < tab.length; i++) {
                Long t = tab[i];
                Livraison liv;
                System.out.println("-----------" + t);
                liv = iLivraisonService.findLivraisonById(t);
                liv.setStatus_livraison(1);
                iLivraisonService.updateLivraison(liv);
                listes.add(liv);
            }
        
        commande.setLivraisons(listes);
       return iCommandeService.createCommande(commande);
      
     
    }
    public  Commande updateCommande(){
      commande.setDate_commande(new Date());
      return iCommandeService.updateCommande(commande);
    }
    public  Commande findCommandeById(){
      return iCommandeService.findCommandeById(commande.getId());
    }
   
    public List<Commande> findAllCommande(){
      return iCommandeService.findAllCommande();
    }
    
    public List<Livraison> getListeLivraisons() throws ServiceException {
        List<Livraison> livrer = new ArrayList<Livraison>();
        List<Livraison> listess = iLivraisonService.findAllLivraison();
        for (Livraison listess1 : listess) {
            if(listess1.getStatus_livraison()==0){
                livrer.add(listess1);
            }
        }
        return livrer;
        
}
}

