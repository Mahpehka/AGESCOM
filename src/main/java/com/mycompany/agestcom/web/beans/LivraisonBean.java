/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Livraison;
import com.mycompany.agestcom.service.ILivraisonService;
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
    
    public LivraisonBean() {
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
    
    
    
    public Livraison createLivraison(){
      return iLivraisonService.createLivraison(livraison);
    }
    public Livraison updateLivraison(){
      return iLivraisonService.updateLivraison(livraison);
    }
    public  Livraison findFLivraisonById(){
      return iLivraisonService.findLivraisonById(livraison.getId());
    }
    public List<Livraison> findAllLivraison(){
      return iLivraisonService.findAllLivraison();
    }
}
