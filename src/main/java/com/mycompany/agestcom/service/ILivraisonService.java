/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service;

import com.mycompany.agestcom.data.Livraison;
import java.util.List;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author root
 */
public interface ILivraisonService {
    
    public  Livraison createLivraison(Livraison livraison) ;
    public  Livraison updateLivraison(Livraison Livraison) ;
    public  Livraison findLivraisonById(Long id) ;
    public List< Livraison> findAllLivraison();
    public void deleteLivraison(Long id);
    
}
