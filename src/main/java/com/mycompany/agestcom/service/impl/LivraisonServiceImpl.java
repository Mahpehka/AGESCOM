/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.ILivraisonDao;
import com.mycompany.agestcom.data.Livraison;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author root
 */
@Transactional
public class LivraisonServiceImpl implements ILivraisonDao{
    
    @Autowired
    private ILivraisonDao iLivraisonDao;

    public ILivraisonDao getiLivraisonDao() {
        return iLivraisonDao;
    }

    public void setiLivraisonDao(ILivraisonDao iLivraisonDao) {
        this.iLivraisonDao = iLivraisonDao;
    }
    
    Livraison livraison= new  Livraison();
    public Livraison findById(Long id) throws DataAccessException {

         livraison = iLivraisonDao.findById(id);
        return livraison;
    }
    
    List<Livraison> livraisons = new LinkedList();
    public List<Livraison> findAll() throws DataAccessException {

         livraisons = iLivraisonDao.findAll();
        return livraisons;
    }

    public Livraison create(Livraison t) throws DataAccessException {

        livraison = iLivraisonDao.create(t);
        return livraison;
    }
    

    public void delete(Livraison t) throws DataAccessException {

         iLivraisonDao.delete(t);
    }

    public Livraison update(Livraison t) throws DataAccessException {

        iLivraisonDao.delete(t);
        return livraison;
    }
    
    
}
