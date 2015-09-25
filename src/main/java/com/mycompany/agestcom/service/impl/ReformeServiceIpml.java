/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.IReformeDao;
import com.mycompany.agestcom.data.Reforme;
import com.mycompany.agestcom.service.IReformeService;
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
public class ReformeServiceIpml implements IReformeService{
     private IReformeDao iReformeDao;

    public IReformeDao getiReformeDao() {
        return iReformeDao;
    }

    public void setiReformeDao(IReformeDao iReformeDao) {
        this.iReformeDao = iReformeDao;
    }

   
    public Reforme createReforme(Reforme reforme) {

         try {
             return iReformeDao.create(reforme);
         } catch (DataAccessException ex) {
             Logger.getLogger(ReformeServiceIpml.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }

    public Reforme updateReforme(Reforme reforme) {

         try {
             return iReformeDao.update(reforme);
         } catch (DataAccessException ex) {
             Logger.getLogger(ReformeServiceIpml.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }

    public List<Reforme> findAllReforme() {

         try {
             return iReformeDao.findAll();
         } catch (DataAccessException ex) {
             Logger.getLogger(ReformeServiceIpml.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }

    public void deleteReforme(Long id) {

         try {
             Reforme reforme=iReformeDao.findById(id);
             iReformeDao.delete(reforme);
         } catch (DataAccessException ex) {
             Logger.getLogger(ReformeServiceIpml.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}
