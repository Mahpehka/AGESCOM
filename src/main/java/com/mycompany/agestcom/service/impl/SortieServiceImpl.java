/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.ISortieDao;
import com.mycompany.agestcom.data.Sortie;
import com.mycompany.agestcom.service.ISortieService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class SortieServiceImpl implements ISortieService{
      private ISortieDao iSortieDao;

    public ISortieDao getiSortieDao() {
        return iSortieDao;
    }

    public void setiSortieDao(ISortieDao iSortieDao) {
        this.iSortieDao = iSortieDao;
    }

  


    public Sortie createSortie(Sortie sortie) {
          try {
              return iSortieDao.create(sortie);
          } catch (DataAccessException ex) {
              Logger.getLogger(SortieServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
          }
          return null;
         }

    public Sortie updateSortie(Sortie sortie) {

          try {
              return iSortieDao.update(sortie);
          } catch (DataAccessException ex) {
              Logger.getLogger(SortieServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
          }
          return null;
    }    

    public Sortie findSortieById(Long id) {
          try {   
              return iSortieDao.findById(id);
          } catch (DataAccessException ex) {
              Logger.getLogger(SortieServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
          }
          return null;
    }

    public List<Sortie> findAllSortie() {
          try {
              return iSortieDao.findAll();
          } catch (DataAccessException ex) {
              Logger.getLogger(SortieServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
          }
          return null;
    }


  
    }

