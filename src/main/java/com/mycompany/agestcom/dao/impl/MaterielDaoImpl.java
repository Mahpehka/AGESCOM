/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.dao.impl;

import com.douwe.generic.dao.DataAccessException;
import com.douwe.generic.dao.impl.GenericDao;
import com.mycompany.agestcom.dao.IMaterielDao;
import com.mycompany.agestcom.data.Materiel;
import java.io.Serializable;

/**
 *
 * @author root
 */
public class MaterielDaoImpl extends GenericDao<Materiel, Long> implements IMaterielDao{

    public Materiel findMaterielByN_serie(String n_serie) throws DataAccessException {
        return (Materiel)(getManager().createNamedQuery("Materiel.findMaterielByN_serie").setParameter("param", n_serie).getSingleResult());
    }
    }
    
   
