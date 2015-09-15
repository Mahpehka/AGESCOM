/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.ICommandeDao;
import com.mycompany.agestcom.data.Commande;
import java.util.LinkedList;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author root
 */
@Transactional
public class CommandeServiceImpl implements ICommandeDao{
    
     private ICommandeDao iCommandeDao;

    public ICommandeDao getiCommandeDao() {
        return iCommandeDao;
    }

    public void setiCommandeDao(ICommandeDao iCommandeDao) {
        this.iCommandeDao = iCommandeDao;
    }

    Commande commande = new Commande();

    public Commande findById(Long id) throws DataAccessException {
        commande = iCommandeDao.findById(id);
        return commande;
    }
    List<Commande> commandes = new LinkedList();

    public List<Commande> findAll() throws DataAccessException {
        commandes = iCommandeDao.findAll();
        return commandes;
    }

    public Commande create(Commande t) throws DataAccessException {

        commande = iCommandeDao.create(t);
        return commande;
    }

    public void delete(Commande t) throws DataAccessException {

        iCommandeDao.delete(t);
    }

    public Commande update(Commande t) throws DataAccessException {
        iCommandeDao.delete(t);
        return commande;
    }

}
