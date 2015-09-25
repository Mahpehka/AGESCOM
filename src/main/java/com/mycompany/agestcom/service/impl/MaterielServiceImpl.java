/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.IMaterielDao;
import com.mycompany.agestcom.data.Materiel;
import com.mycompany.agestcom.service.IMaterielService;
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
public class MaterielServiceImpl implements IMaterielService{
    
    private IMaterielDao materielDao;
       
    private  IMaterielDao iMaterielDao;

    public IMaterielDao getiMaterielDao() {
        return iMaterielDao;
    }

    public void setiMaterielDao(IMaterielDao iMaterielDao) {
        this.iMaterielDao = iMaterielDao;
    }
    
   
    public Materiel createMateriel(Materiel materiel) {

        try {
            return iMaterielDao.create(materiel);
        } catch (DataAccessException ex) {
            Logger.getLogger(MaterielServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Materiel updateMateriel(Materiel materiel) {

        try {
            return  iMaterielDao.update(materiel);
        } catch (DataAccessException ex) {
            Logger.getLogger(MaterielServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Materiel findFMaterielById(Long id) {

        try {
            return iMaterielDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(MaterielServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Materiel findMaterielByN_serie(String n_serie) {
      
         try {
            Materiel materiel = materielDao.findMaterielByN_serie(n_serie);
            if (materiel == null) {
                throw new ServiceException("Le materiel dont le numéro est " + n_serie + " n'existe pas");
            }
            return materiel;
        } catch (DataAccessException ex) {
            Logger.getLogger(MaterielServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public List<Materiel> findAllMateriel() {

        try {
            return  iMaterielDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(MaterielServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void deleteMateriel(Long id) {

        try {
            Materiel materiel=iMaterielDao.findById(id);
            iMaterielDao.delete(materiel);
        } catch (DataAccessException ex) {
            Logger.getLogger(MaterielServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}

