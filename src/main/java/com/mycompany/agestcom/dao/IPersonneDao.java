/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.dao;

import com.douwe.generic.dao.DataAccessException;
import com.douwe.generic.dao.IDao;
import com.mycompany.agestcom.data.Personne;
import java.io.Serializable;

/**
 *
 * @author root
 */
public interface IPersonneDao extends IDao<Personne, Long>{

       public Personne findByLogin(String s) throws DataAccessException;
       public  Personne findByPassword (String s) throws DataAccessException;
}
