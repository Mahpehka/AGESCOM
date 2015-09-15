/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service;

import com.mycompany.agestcom.data.Cession;
import java.util.List;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author root
 */
public interface ICessionService {
    
    public Cession createCession(Cession cession) ;
    public  Cession updateCession( Cession cession) ;
    public List<Cession> findAllCession() ;
    public void deleteCession(Long id) ;
    public Cession findById() ;
    
    
}
