/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service;

import com.mycompany.agestcom.data.Fiche_detenteur;
import java.util.List;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author root
 */
public interface IFiche_detenteurService {
    
    public Fiche_detenteur createFiche_detenteur(Fiche_detenteur fiche_detenteur) ;
    public Fiche_detenteur updateFiche_detenteur(Fiche_detenteur fiche_detenteur);
    public Fiche_detenteur findFiche_detenteurById(Long id);
    public List<Fiche_detenteur> findAllFiche_detenteurs();
    public void deleteFiche_detenteur(Long id);
    
}
