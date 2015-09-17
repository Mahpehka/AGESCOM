/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.ICessionDao;
import com.mycompany.agestcom.data.Cession;
import com.mycompany.agestcom.service.ICessionService;
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
public class CessionServiceImpl implements ICessionService {

    private ICessionDao iCessionDao;

    public ICessionDao getiCessionDao() {
        return iCessionDao;
    }

    public void setiCessionDao(ICessionDao iCessionDao) {
        this.iCessionDao = iCessionDao;
    }
  
    public Cession createCession(Cession cession) {
        try {
            return iCessionDao.create(cession);
        } catch (DataAccessException ex) {
            Logger.getLogger(CessionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public Cession updateCession(Cession cession) {
        try {
            return iCessionDao.update(cession);
        } catch (DataAccessException ex) {
            Logger.getLogger(CessionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Cession> findAllCession() {
        try {
            return iCessionDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(CessionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void deleteCession(Long id) {
        try {
            Cession cession = iCessionDao.findById(id);
            if(cession != null ){
                iCessionDao.delete(cession);
            }
        } catch (DataAccessException ex) {
            Logger.getLogger(CessionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cession findById(Long id) {
        try {
            return iCessionDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(CessionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
