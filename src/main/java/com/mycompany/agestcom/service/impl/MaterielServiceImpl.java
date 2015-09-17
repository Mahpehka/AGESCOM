/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.IMaterielDao;
import com.mycompany.agestcom.data.Materiel;
import com.mycompany.agestcom.service.IMaterielServcice;
import java.util.LinkedList;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author root
 */
@Transactional
public class MaterielServiceImpl implements IMaterielServcice{
    private  IMaterielDao iMaterielDao;

    public IMaterielDao getiMaterielDao() {
        return iMaterielDao;
    }

    public void setiMaterielDao(IMaterielDao iMaterielDao) {
        this.iMaterielDao = iMaterielDao;
    }
    
   
    public Materiel createMateriel(Materiel materiel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Materiel updateMateriel(Materiel materiel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Materiel findFMaterielById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Materiel findMaterielByN_serie(String n_serie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Materiel> findAllMateriel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteMateriel(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Materiel findMaterielById(long l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Materiel findMaterielByN_serieById(long l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

