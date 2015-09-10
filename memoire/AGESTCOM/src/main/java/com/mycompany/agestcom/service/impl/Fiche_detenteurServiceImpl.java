/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.IFiche_detenteurDao;
import com.mycompany.agestcom.data.Fiche_detenteur;
import java.util.LinkedList;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author root
 */
@Transactional
public class Fiche_detenteurServiceImpl implements IFiche_detenteurDao{
    
    private IFiche_detenteurDao iFiche_detenteurDao;

    public IFiche_detenteurDao getiFiche_detenteurDao() {
        return iFiche_detenteurDao;
    }

    public void setiFiche_detenteurDao(IFiche_detenteurDao iFiche_detenteurDao) {
        this.iFiche_detenteurDao = iFiche_detenteurDao;
    }

    Fiche_detenteur fiche_detenteur = new Fiche_detenteur();

    public Fiche_detenteur findById(Long id) throws DataAccessException {

        fiche_detenteur = iFiche_detenteurDao.findById(id);
        return fiche_detenteur;
    }

    List<Fiche_detenteur> fiche_detenteurs = new LinkedList();

    public List<Fiche_detenteur> findAll() throws DataAccessException {

        fiche_detenteurs = iFiche_detenteurDao.findAll();
        return fiche_detenteurs;
    }

    public Fiche_detenteur create(Fiche_detenteur t) throws DataAccessException {

        fiche_detenteur = iFiche_detenteurDao.create(t);
        return fiche_detenteur;
    }

    public void delete(Fiche_detenteur t) throws DataAccessException {

        iFiche_detenteurDao.delete(t);
    }

    public Fiche_detenteur update(Fiche_detenteur t) throws DataAccessException {

        iFiche_detenteurDao.delete(t);
        return fiche_detenteur;
    }
}
