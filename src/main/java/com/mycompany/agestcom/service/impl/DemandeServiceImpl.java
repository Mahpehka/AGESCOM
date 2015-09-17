/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service.impl;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.dao.IDemandeDao;
import com.mycompany.agestcom.data.Demande;
import com.mycompany.agestcom.service.IDemandeService;
import java.util.LinkedList;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author root
 */
@Transactional
public class DemandeServiceImpl implements IDemandeService{
    
    private IDemandeDao iDemandeDao;

    public IDemandeDao getiDemandeDao() {
        return iDemandeDao;
    }

    public void setiDemandeDao(IDemandeDao iDemandeDao) {
        this.iDemandeDao = iDemandeDao;
    }
    
    
    public Demande createDemande(Demande demande) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Demande updateDemande(Demande demande) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Demande findDemandeById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Demande> findAllDemande() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteDemande(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
