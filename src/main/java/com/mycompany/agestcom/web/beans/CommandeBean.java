/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Commande;
import com.mycompany.agestcom.service.ICommandeService;
import java.util.List;
import javax.inject.Named;
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
     ICommandeService service;
    
    private Commande commande = new Commande();
    
    private Commande commandeChoisi = new Commande();
    
    /**
     * Creates a new instance of CommandeBean
     */
    public CommandeBean() {
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
    
     public List<Commande> getAllCommande() throws ServiceException{
        if(service == null){
                System.out.println("This is my service");
                System.out.println(service);
        }
        return service.findAllCommande();
    }
    
    public String createCommande() throws ServiceException{
        service.createCommande(commande);
        commande=new  Commande();
        return "create";
    }
    
    public String updateCommande() throws ServiceException{
        System.out.println(commande);
        service.updateCommande(commande);
        commande = new  Commande();
        return "update";
    }
    
    public String deleteCommande() throws ServiceException{
        System.out.println("la commande");
        System.out.println(commande);
        service.deleteCommande(commande.getId());
       commande = new  Commande();
        return "supprimer";
    }

    
}
