/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.ICommandeDao;
import com.mycompany.agestcom.dao.IDemandeDao;
import com.mycompany.agestcom.dao.IFournisseurDao;
import com.mycompany.agestcom.data.Demande;
import com.mycompany.agestcom.service.IDemandeService;
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
public class DemandeServiceImpl implements IDemandeService{
    
    private IDemandeDao iDemandeDao;

    public IDemandeDao getiDemandeDao() {
        return iDemandeDao;
    }

    public void setiDemandeDao(IDemandeDao iDemandeDao) {
        this.iDemandeDao = iDemandeDao;
    }
    
    
    public Demande createDemande(Demande demande) {
        
        try {
            return iDemandeDao.create(demande);
        } catch (DataAccessException ex) {
            Logger.getLogger(DemandeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Demande updateDemande(Demande demande) {

        try {
            return iDemandeDao.update(demande);
        } catch (DataAccessException ex) {
            Logger.getLogger(DemandeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Demande findDemandeById(Long id) {

        try {
            return iDemandeDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(DemandeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Demande> findAllDemande() {

        try {
            return iDemandeDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(DemandeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void deleteDemande(Long id) {

        try {
            Demande demande= iDemandeDao.findById(id);
            if((demande)!=null)
                iDemandeDao.delete(demande);
        } catch (DataAccessException ex) {
            Logger.getLogger(DemandeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
}
