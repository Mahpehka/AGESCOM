/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.dao;

import com.douwe.generic.dao.DataAccessException;
import com.douwe.generic.dao.IDao;
import com.mycompany.agestcom.data.Materiel;
import java.io.Serializable;

/**
 *
 * @author root
 */
public interface IMaterielDao extends IDao<Materiel, Long>{
    
     public Materiel findMaterielByN_serie(String n_serie) throws DataAccessException;
    
}
