/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.IFournisseurDao;
import com.mycompany.agestcom.data.Fournisseur;
import com.mycompany.agestcom.service.IFournisseurService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author root
 */
@Transactional
public class FournisseurServiceImpl implements IFournisseurService{
    
        private IFournisseurDao iFournisseurDao;

    public IFournisseurDao getiFournisseurDao() {
        return iFournisseurDao;
    }

    public void setiFournisseurDao(IFournisseurDao iFournisseurDao) {
        this.iFournisseurDao = iFournisseurDao;
    }
        
    
    public Fournisseur createFournisseur(Fournisseur fournisseur) {
         try {
             return iFournisseurDao.create(fournisseur);
         } catch (DataAccessException ex) {
             Logger.getLogger(FournisseurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         return null;
    }

    public Fournisseur updateFournisseur(Fournisseur fournisseur) {
         try {
             return iFournisseurDao.update(fournisseur);
         } catch (DataAccessException ex) {
             Logger.getLogger(FournisseurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }

    public Fournisseur findFournisseurById(Long id) {
         try {
             return iFournisseurDao.findById(id);
         } catch (DataAccessException ex) {
             Logger.getLogger(FournisseurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }

    public List<Fournisseur> findAllFournisseurs() {
         try {
             return iFournisseurDao.findAll();
         } catch (DataAccessException ex) {
             Logger.getLogger(FournisseurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }

    public void deleteFournisseur(Long id) {
         try {
             Fournisseur fournisseur = iFournisseurDao.findById(id);
             if(fournisseur != null){
                 iFournisseurDao.delete(fournisseur);
             }
         } catch (DataAccessException ex) {
             Logger.getLogger(FournisseurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}
