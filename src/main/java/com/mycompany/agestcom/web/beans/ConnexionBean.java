/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author root
 */
@ManagedBean
@RequestScoped
public class ConnexionBean {

    /**
     * Creates a new instance of ConnexionBean
     */
    public ConnexionBean() {
      
    }
    
    public  String seconnecter(){
          return "src/main/webapp/menu.xhtml?faces-redirect=true";
    
    }
    }
    

