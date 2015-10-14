/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.dao.impl;

import com.douwe.generic.dao.DataAccessException;
import com.douwe.generic.dao.impl.GenericDao;
import com.mycompany.agestcom.dao.IPersonneDao;
import com.mycompany.agestcom.data.Personne;
import java.io.Serializable;

/**
 *
 * @author root
 */
public class PersonneDaoImpl extends GenericDao<Personne, Long> implements IPersonneDao{

    
    public Personne findByLogin(String s) throws DataAccessException {
        return  (Personne) getManager().createNamedQuery("Personne.findByLogin").setParameter("param", s).getSingleResult();
    
    }

    public Personne findByPassword(String s) throws DataAccessException {

    return (Personne) getManager().createNamedQuery("Personne.findByPassword").setParameter("param", s).getSingleResult();
    }
    
}
