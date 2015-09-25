/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.IFiche_detenteurDao;
import com.mycompany.agestcom.data.Fiche_detenteur;
import com.mycompany.agestcom.service.IFiche_detenteurService;
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
public class Fiche_detenteurServiceImpl implements IFiche_detenteurService{
    
    private IFiche_detenteurDao iFiche_detenteurDao;

    public IFiche_detenteurDao getiFiche_detenteurDao() {
        return iFiche_detenteurDao;
    }

    public void setiFiche_detenteurDao(IFiche_detenteurDao iFiche_detenteurDao) {
        this.iFiche_detenteurDao = iFiche_detenteurDao;
    }

   
    public Fiche_detenteur createFiche_detenteur(Fiche_detenteur fiche_detenteur) {

        try {
            return iFiche_detenteurDao.create(fiche_detenteur);
        } catch (DataAccessException ex) {
            Logger.getLogger(Fiche_detenteurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Fiche_detenteur updateFiche_detenteur(Fiche_detenteur fiche_detenteur) {

        try {
            return  iFiche_detenteurDao.update(fiche_detenteur);
        } catch (DataAccessException ex) {
            Logger.getLogger(Fiche_detenteurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Fiche_detenteur findFiche_detenteurById(Long id) {

        try {
            return iFiche_detenteurDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(Fiche_detenteurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Fiche_detenteur> findAllFiche_detenteurs() {

        try {
            return iFiche_detenteurDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(Fiche_detenteurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void deleteFiche_detenteur(Long id) {

        try {
            Fiche_detenteur fiche_detenteur=iFiche_detenteurDao.findById(id);
            iFiche_detenteurDao.delete(fiche_detenteur);
        } catch (DataAccessException ex) {
            Logger.getLogger(Fiche_detenteurServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
