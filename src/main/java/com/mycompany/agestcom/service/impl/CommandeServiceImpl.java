/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.ICommandeDao;
import com.mycompany.agestcom.data.Commande;
import com.mycompany.agestcom.service.ICommandeService;
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
public class CommandeServiceImpl implements ICommandeService{
    
     private ICommandeDao iCommandeDao;

    public ICommandeDao getiCommandeDao() {
        return iCommandeDao;
    }

    public void setiCommandeDao(ICommandeDao iCommandeDao) {
        this.iCommandeDao = iCommandeDao;
    }

    
    public Commande createCommande(Commande commande) {

         try {
             return iCommandeDao.create(commande);
         } catch (DataAccessException ex) {
             Logger.getLogger(CommandeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }

    public Commande updateCommande(Commande commande) {

         try {
             return iCommandeDao.update(commande);
         } catch (DataAccessException ex) {
             Logger.getLogger(CommandeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }

    public Commande findCommandeById(Long id) {

         try {
             return iCommandeDao.findById(id);
         } catch (DataAccessException ex) {
             Logger.getLogger(CommandeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }

    public List<Commande> findAllCommande() {

         try {
             return iCommandeDao.findAll();
         } catch (DataAccessException ex) {
             Logger.getLogger(CommandeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }

    public void deleteCommande(Long id) {

         try {
             Commande commande=iCommandeDao.findById(id);
             if((commande!= null))
                 iCommandeDao.delete(commande);
         } catch (DataAccessException ex) {
             Logger.getLogger(CommandeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

}
