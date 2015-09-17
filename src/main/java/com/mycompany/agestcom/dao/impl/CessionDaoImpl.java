/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.dao.impl;

import com.douwe.generic.dao.DataAccessException;
import com.douwe.generic.dao.impl.GenericDao;
import com.mycompany.agestcom.dao.ICessionDao;
import com.mycompany.agestcom.data.Cession;

/**
 *
 * @author root
 */
public class CessionDaoImpl extends GenericDao<Cession, Long> implements ICessionDao{

    public Cession findByDescription(String description) throws DataAccessException {
        return (Cession) (getManager().createNamedQuery("Cession.findByDescription").setParameter("param", description).getSingleResult());
    }
     
}
