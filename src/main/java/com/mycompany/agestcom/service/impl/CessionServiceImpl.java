/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.ICessionDao;
import com.mycompany.agestcom.data.Cession;
import java.util.LinkedList;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author root
 */
@Transactional
public class CessionServiceImpl implements ICessionDao {

    private ICessionDao iCessionDao;

    public ICessionDao getiCessionDao() {
        return iCessionDao;
    }

    public void setiCessionDao(ICessionDao iCessionDao) {
        this.iCessionDao = iCessionDao;
    }
    Cession cession = new Cession();

    public Cession findById(Long id) throws DataAccessException {

        cession = iCessionDao.findById(id);
        return cession;
    }
    List<Cession> cessions = new LinkedList();
    public List<Cession> findAll() throws DataAccessException {
        cessions = iCessionDao.findAll();
        return cessions;
    }

    public Cession create(Cession t) throws DataAccessException {
        Cession c = new Cession();
        cession = iCessionDao.create(t);
        return cession;
    }

    public void delete(Cession t) throws DataAccessException {
         iCessionDao.delete(t);
    }

    public Cession update(Cession t) throws DataAccessException {
         Cession c = new Cession();
         iCessionDao.delete(t);
        return cession;
    }

}
