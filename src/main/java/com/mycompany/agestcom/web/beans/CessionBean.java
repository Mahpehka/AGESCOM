/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Cession;
import com.mycompany.agestcom.service.ICessionService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author root
 */
@ManagedBean
@Dependent
public class CessionBean {

    
     @ManagedProperty(value = "#{ICessionService}")
     ICessionService iCessionService;
    
     Cession cession=new  Cession();
  
    public CessionBean() {
    }

    public ICessionService getiCessionService() {
        return iCessionService;
    }

    public void setiCessionService(ICessionService iCessionService) {
        this.iCessionService = iCessionService;
    }

    public Cession getCession() {
        return cession;
    }

    public void setCession(Cession cession) {
        this.cession = cession;
    }
   
    
    public Cession createCession(){
      return iCessionService.createCession(cession);
    }
    public  Cession updateCession(){
      return iCessionService.updateCession(cession);
    }
  
    public List<Cession> findAllCession(){
      return iCessionService.findAllCession();
    }
   
    
}
