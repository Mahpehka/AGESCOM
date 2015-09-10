/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service;

import com.mycompany.agestcom.data.Fournisseur;
import java.util.List;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author root
 */
public interface IFournisseurService {
    
    public Fournisseur createFournisseur(Fournisseur fournisseur);
    public  Fournisseur updateFournisseur( Fournisseur fournisseur);
    public  Fournisseur findFournisseurById(Long id) ;
    public List< Fournisseur> findAllFournisseurs();
    public void deleteFournisseur(Long id);
    
 
}
