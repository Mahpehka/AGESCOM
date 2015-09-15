/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.IDemandeDao;
import com.mycompany.agestcom.data.Demande;
import java.util.LinkedList;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author root
 */
@Transactional
public class DemandeServiceImpl implements IDemandeDao{
    
    private IDemandeDao iDemandeDao;

    public IDemandeDao getiDemandeDao() {
        return iDemandeDao;
    }

    public void setiDemandeDao(IDemandeDao iDemandeDao) {
        this.iDemandeDao = iDemandeDao;
    }
    
    Demande demande=new  Demande();
    public Demande findById(Long id) throws DataAccessException {

         demande = iDemandeDao.findById(id);
        return demande;
    }
    
    List<Demande> demandes = new LinkedList();
    public List<Demande> findAll() throws DataAccessException {

        demandes = iDemandeDao.findAll();
        return demandes;
    }

    public Demande create(Demande t) throws DataAccessException {
        demande = iDemandeDao.create(t);
        return demande;
    }

    public void delete(Demande t) throws DataAccessException {
           iDemandeDao.delete(t);
    }

    public Demande update(Demande t) throws DataAccessException {

         iDemandeDao.delete(t);
        return demande;
    }
    
}
