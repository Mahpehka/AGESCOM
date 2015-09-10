/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service;

import com.mycompany.agestcom.data.Personne;
import java.util.List;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author root
 */
public interface IPersonneService {
    public Personne createPersonne(Personne personne) ;
    public  Personne updatePersonne(Personne personne) ;
    public  Personne findPersonneById(Long id);
    public List< Personne> findAllPersonne();
    public void deletePersonne(Long id);
    
}
