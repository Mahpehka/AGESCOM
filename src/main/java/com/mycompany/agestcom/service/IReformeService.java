/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service;

import com.mycompany.agestcom.data.Reforme;
import java.util.List;

/**
 *
 * @author root
 */
public interface IReformeService {
    
    public Reforme createReforme(Reforme reforme);
    public  Reforme updateReforme(Reforme reforme);
    public List< Reforme> findAllReforme();
    public void deleteReforme(Long id);
    
}
