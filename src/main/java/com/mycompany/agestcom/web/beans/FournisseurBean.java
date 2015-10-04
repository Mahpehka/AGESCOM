/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.data.Fournisseur;
import com.mycompany.agestcom.service.IFournisseurService;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.SelectableDataModel;


/**
 *
 * @author root
 */
@ManagedBean
@RequestScoped 
public class FournisseurBean implements SelectableDataModel<Fournisseur>{

    @ManagedProperty(value = "#{IFournisseurService}")
    IFournisseurService iFournisseurService;
    
    private Fournisseur fournisseur = new Fournisseur();
    
    private List<Fournisseur> fournisseurs = new LinkedList<Fournisseur>();

    
    
    public List<Fournisseur> getFournisseurs() {
        try {
            fournisseurs = iFournisseurService.findAllFournisseurs();
        } catch (DataAccessException ex) {
            Logger.getLogger(FournisseurBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fournisseurs;
    }

    public void setFournisseurs(List<Fournisseur> fournisseurs) {
        this.fournisseurs = fournisseurs;
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
    
    public void Save(){
        
        try {
            iFournisseurService.createFournisseur(fournisseur);
        } catch (DataAccessException ex) {
            Logger.getLogger(FournisseurBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Override
    public Object getRowKey(Fournisseur t) {
        return t.getId();
        }

    public Fournisseur getRowData(String rowKey) {
        
        List<Fournisseur> ag = getFournisseurs();
        for (Fournisseur entre : ag) {
            if (entre.getId().equals(rowKey)) {
                return entre;
            }
        }
        return null;
        }
    
}
