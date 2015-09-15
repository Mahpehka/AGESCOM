/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.IFournisseurDao;
import com.mycompany.agestcom.data.Fournisseur;
import java.util.LinkedList;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author root
 */
@Transactional
public class FournisseurServiceImpl implements IFournisseurDao{
        private IFournisseurDao iFournisseurDao;

    public IFournisseurDao getiFournisseurDao() {
        return iFournisseurDao;
    }

    public void setiFournisseurDao(IFournisseurDao iFournisseurDao) {
        this.iFournisseurDao = iFournisseurDao;
    }
        
    Fournisseur fournisseur = new Fournisseur();

    public Fournisseur findByNom(String nom) throws DataAccessException {
    
        fournisseur = iFournisseurDao.findByNom(nom);
        return fournisseur;
    }
    

    public Fournisseur findById(Long id) throws DataAccessException {

       fournisseur = iFournisseurDao.findById(id);
        return fournisseur; 
    }

     List<Fournisseur> fournisseurs = new LinkedList();
    public List<Fournisseur> findAll() throws DataAccessException {

         fournisseurs = iFournisseurDao.findAll();
        return fournisseurs;
    }

    public Fournisseur create(Fournisseur t) throws DataAccessException {

        fournisseur = iFournisseurDao.create(t);
        return fournisseur;
    }

    public void delete(Fournisseur t) throws DataAccessException {

        iFournisseurDao.delete(t);
    }

    public Fournisseur update(Fournisseur t) throws DataAccessException {

        fournisseur =iFournisseurDao.create(t);
        return fournisseur;
    }
    
}
