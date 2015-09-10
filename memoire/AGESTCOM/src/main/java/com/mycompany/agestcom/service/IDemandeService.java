/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service;

import com.mycompany.agestcom.data.Demande;
import java.util.List;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author root
 */
public interface IDemandeService {
    
     public Demande createDemande(Demande demande) ;
    public Demande updateDemande(Demande demande);
    public Demande findDemandeById(Long id);
    public List<Demande> findAllDemande();
    public void deleteDemande(Long id);
    
}
