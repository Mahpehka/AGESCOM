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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Fiche_detenteur updateFiche_detenteur(Fiche_detenteur fiche_detenteur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Fiche_detenteur findFiche_detenteurById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Fiche_detenteur> findAllFiche_detenteurs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteFiche_detenteur(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
