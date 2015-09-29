/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Reforme;
import com.mycompany.agestcom.service.IReformeService;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author root
 */
@Named(value = "reformeBean")
@Dependent
public class ReformeBean {

   @ManagedProperty(value = "#{IReformeService}")
    IReformeService iReformeService;
    Reforme reforme=new Reforme();
    
    public ReformeBean() {
    }

    public IReformeService getiReformeService() {
        return iReformeService;
    }

    public void setiReformeService(IReformeService iReformeService) {
        this.iReformeService = iReformeService;
    }

    public Reforme getReforme() {
        return reforme;
    }

    public void setReforme(Reforme reforme) {
        this.reforme = reforme;
    }
   
   
      public Reforme createReforme(){
      return iReformeService.createReforme(reforme);
    }
    public  Reforme updateReforme(){
      return iReformeService.updateReforme(reforme);
    }
    public List<Reforme> findAllReforme(){
      return iReformeService.findAllReforme();
    }
}
