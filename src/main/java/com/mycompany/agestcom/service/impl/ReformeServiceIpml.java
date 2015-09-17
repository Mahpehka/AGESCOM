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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Reforme updateReforme(Reforme reforme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Reforme> findAllReforme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteReforme(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
