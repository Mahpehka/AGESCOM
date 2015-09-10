/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.IMaterielDao;
import com.mycompany.agestcom.data.Materiel;
import java.util.LinkedList;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author root
 */
@Transactional
public class MaterielServiceImpl implements IMaterielDao{
    private  IMaterielDao iMaterielDao;

    public IMaterielDao getiMaterielDao() {
        return iMaterielDao;
    }

    public void setiMaterielDao(IMaterielDao iMaterielDao) {
        this.iMaterielDao = iMaterielDao;
    }
    
    Materiel materiel=new  Materiel();
    public Materiel findById(Long id) throws DataAccessException {

        materiel = iMaterielDao.findById(id);
        return materiel;
    }

     List<Materiel> materiels = new LinkedList();
    public List<Materiel> findAll() throws DataAccessException {

        materiels = iMaterielDao.findAll();
        return materiels;
    }

    public Materiel create(Materiel t) throws DataAccessException {

        materiel = iMaterielDao.create(t);
        return materiel;
    }

    public void delete(Materiel t) throws DataAccessException {

           iMaterielDao.delete(t);
    }

    public Materiel update(Materiel t) throws DataAccessException {

        iMaterielDao.delete(t);
        return materiel;
    }
   
}

