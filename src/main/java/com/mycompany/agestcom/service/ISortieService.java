/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service;

import com.mycompany.agestcom.data.Sortie;
import java.util.List;

/**
 *
 * @author root
 */
public interface ISortieService {
    
    public Sortie createSortie(Sortie sortie) ;
    public  Sortie updateSortie(Sortie sortie) ;
    public  Sortie findSortieById(Long id);
    public List< Sortie> findAllSortie();
    
}
