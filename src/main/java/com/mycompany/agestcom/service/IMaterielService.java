/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service;

import com.mycompany.agestcom.data.Materiel;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author root
 */
@Transactional
public interface IMaterielService {
    public Materiel createMateriel(Materiel materiel);
    public  Materiel updateMateriel( Materiel materiel);
    public  Materiel findFMaterielById(Long id);
    public Materiel findMaterielByN_serie(String n_serie) ;
    public List<Materiel> findAllMateriel();
    public void deleteMateriel(Long id) ;
    
}
