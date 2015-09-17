/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.ILivraisonDao;
import com.mycompany.agestcom.data.Livraison;
import com.mycompany.agestcom.service.ILivraisonService;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author root
 */
@Transactional
public class LivraisonServiceImpl implements ILivraisonService{
    
    
    private ILivraisonDao iLivraisonDao;

    public ILivraisonDao getiLivraisonDao() {
        return iLivraisonDao;
    }

    public void setiLivraisonDao(ILivraisonDao iLivraisonDao) {
        this.iLivraisonDao = iLivraisonDao;
    }
    
    
    public Livraison createLivraison(Livraison livraison) {
        try {
            return iLivraisonDao.create(livraison);
        } catch (DataAccessException ex) {
            Logger.getLogger(LivraisonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Livraison updateLivraison(Livraison Livraison) {
        try {
            return iLivraisonDao.update(Livraison);
        } catch (DataAccessException ex) {
            Logger.getLogger(LivraisonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Livraison findLivraisonById(Long id) {
        try {
            return iLivraisonDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(LivraisonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Livraison> findAllLivraison() {
        try {
            return iLivraisonDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(LivraisonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void deleteLivraison(Long id) {
        try {
            Livraison livraison = iLivraisonDao.findById(id);
            if(livraison != null){
                iLivraisonDao.delete(livraison);
            }
        } catch (DataAccessException ex) {
            Logger.getLogger(LivraisonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
