/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service;

import com.mycompany.agestcom.data.Materiel;
import java.util.List;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author root
 */
public interface IMaterielServcice {
    public Materiel createMateriel(Materiel materiel) ;
    public  Materiel updateMateriel( Materiel materiel);
    public  Materiel findFMaterielById(Long id);
    public Materiel findMaterielByN_serie(String n_serie) ;
    public List<Materiel> findAllMateriel();
    public void deleteMateriel(Long id) ;

    public Materiel findMaterielById(long l);

    public Materiel findMaterielByN_serieById(long l);
    
}
