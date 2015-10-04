/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.data.Fournisseur;
import java.util.List;

/**
 *
 * @author root
 */
public interface IFournisseurService {
    
    public Fournisseur createFournisseur(Fournisseur fournisseur) throws DataAccessException;
    
    public  Fournisseur updateFournisseur( Fournisseur fournisseur) throws DataAccessException;
    
    public  Fournisseur findFournisseurById(Long id) throws DataAccessException;
    
    public List< Fournisseur> findAllFournisseurs() throws DataAccessException;
    
    public void deleteFournisseur(Long id) throws DataAccessException;
    
 
}
