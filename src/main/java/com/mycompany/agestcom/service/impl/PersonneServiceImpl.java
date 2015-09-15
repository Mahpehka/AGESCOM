/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.IPersonneDao;
import com.mycompany.agestcom.data.Personne;
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
public class PersonneServiceImpl implements IPersonneDao{
    
    private IPersonneDao iPerseonneDao;

    public Personne findById(Long id) throws DataAccessException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
          try {
            return iPerseonneDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(PersonneServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("");
        }
    }

    public List<Personne> findAll() throws DataAccessException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        try {
            return iPerseonneDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(PersonneServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("");

    }
        }

    public Personne create(Personne personne) throws DataAccessException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iPerseonneDao.create(personne);
        } catch (DataAccessException ex) {
            Logger.getLogger(PersonneServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("");
        }
    }

    public void delete(Personne personne) throws DataAccessException {
         try {
        //    Personne personne= iPerseonneDao.findById(id);
            iPerseonneDao.delete(personne);
        } catch (DataAccessException ex) {
            Logger.getLogger(PersonneServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    

    public Personne update(Personne personne) throws DataAccessException {

     try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iPerseonneDao.update(personne);
        } catch (DataAccessException ex) {
            Logger.getLogger(PersonneServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("");
        }
    }
    

   
}
