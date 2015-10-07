/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Materiel;
import com.mycompany.agestcom.data.Type;
import com.mycompany.agestcom.service.IMaterielService;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author root
 */
@ManagedBean
@RequestScoped
public class MaterielBean {

     @ManagedProperty(value = "#{IMaterielService}")
     IMaterielService iMaterielService;
    
     Materiel materiel = new Materiel();
  
    public MaterielBean() {
        
    }

    public IMaterielService getiMaterielService() {
        return iMaterielService;
    }

    public void setiMaterielService(IMaterielService iMaterielService) {
        this.iMaterielService = iMaterielService;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

    public Materiel createMateriel(){
      return iMaterielService.createMateriel(materiel);
    }
    public  Materiel updateMateriel(){
      return iMaterielService.updateMateriel(materiel);
    }
    public  Materiel findFMaterielById(){
      return iMaterielService.findFMaterielById(materiel.getId());
    }
    public Materiel findMaterielByN_serie(){
      return iMaterielService.findMaterielByN_serie(materiel.getN_serie());
    }
    public List<Materiel> findAllMateriel(){
      return iMaterielService.findAllMateriel();
    }
   
    public List getTypes() {
        List<Type> result = new ArrayList<Type>();
        result.add(Type.consomptible);
        result.add(Type.durable);
        return result;
    }
}
