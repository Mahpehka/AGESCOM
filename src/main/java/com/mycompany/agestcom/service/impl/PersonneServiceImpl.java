/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.IPersonneDao;
import com.mycompany.agestcom.data.Personne;
import com.mycompany.agestcom.service.IPersonneService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author root
 */
@Transactional
public class PersonneServiceImpl implements IPersonneService{
    
    private IPersonneDao iPerseonneDao;

    public IPersonneDao getiPerseonneDao() {
        return iPerseonneDao;
    }

    public void setiPerseonneDao(IPersonneDao iPerseonneDao) {
        this.iPerseonneDao = iPerseonneDao;
    }
    

    public Personne createPersonne(Personne personne) {

        try {
            return iPerseonneDao.create(personne);
        } catch (DataAccessException ex) {
            Logger.getLogger(PersonneServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Personne updatePersonne(Personne personne) {

        try {
            return  iPerseonneDao.update(personne);
        } catch (DataAccessException ex) {
            Logger.getLogger(PersonneServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Personne findPersonneById(Long id) {

        try {
            return iPerseonneDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(PersonneServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Personne> findAllPersonne() {

        try {
            return iPerseonneDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(PersonneServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void deletePersonne(Long id) {

        try {
            Personne personne=iPerseonneDao.findById(id);
            iPerseonneDao.delete(personne);
        } catch (DataAccessException ex) {
            Logger.getLogger(PersonneServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

   
}
