/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.IReformeDao;
import com.mycompany.agestcom.data.Reforme;
import java.util.LinkedList;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author root
 */
@Transactional
public class ReformeServiceIpml implements IReformeDao{
     private IReformeDao iReformeDao;

    public IReformeDao getiReformeDao() {
        return iReformeDao;
    }

    public void setiReformeDao(IReformeDao iReformeDao) {
        this.iReformeDao = iReformeDao;
    }

    public Reforme getReforme() {
        return reforme;
    }

    public void setReforme(Reforme reforme) {
        this.reforme = reforme;
    }
     
     
    Reforme reforme = new Reforme();
    public Reforme findById(Long id) throws DataAccessException {

          reforme = iReformeDao.findById(id);
        return reforme;
    }

     List<Reforme> reformes = new LinkedList();
    public List<Reforme> findAll() throws DataAccessException {

         reformes = iReformeDao.findAll();
        return reformes;
    }

    public Reforme create(Reforme t) throws DataAccessException {

        reforme = iReformeDao.create(t);
        return reforme;
    }

    public void delete(Reforme t) throws DataAccessException {

         iReformeDao.delete(t);
    }

    public Reforme update(Reforme t) throws DataAccessException {

        iReformeDao.delete(t);
        return reforme;
    }
    
}
