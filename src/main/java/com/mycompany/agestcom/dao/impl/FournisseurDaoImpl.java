/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.dao.impl;

import com.douwe.generic.dao.DataAccessException;
import com.douwe.generic.dao.impl.GenericDao;
import com.mycompany.agestcom.dao.IFournisseurDao;
import com.mycompany.agestcom.data.Fournisseur;
import java.io.Serializable;

/**
 *
 * @author root
 */
public class FournisseurDaoImpl extends GenericDao<Fournisseur, Long> implements IFournisseurDao{
    public Fournisseur findByNom(String nom) throws DataAccessException {
        return (Fournisseur)(getManager().createNamedQuery("Fournisseur.findByNom").setParameter("param", nom).getSingleResult());
    }

 
    
}
