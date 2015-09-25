/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Materiel;
import com.mycompany.agestcom.service.IMaterielService;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author root
 */
@ManagedBean
@RequestScoped
public class MaterielBean {

    @ManagedProperty(value = "#{IMaterielService}")
     IMaterielService service;
    
    private Materiel materiel = new Materiel();
    private Materiel materielchoisi = new Materiel();
    /**
     * Creates a new instance of MaterielBean
     */
    public MaterielBean() {
    }

    public IMaterielService getService() {
        return service;
    }

    public void setService(IMaterielService service) {
        this.service = service;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

    public Materiel getMaterielchoisi() {
        return materielchoisi;
    }

    public void setMaterielchoisi(Materiel materielchoisi) {
        this.materielchoisi = materielchoisi;
    }
    
    
   public List<Materiel> getAllMateriel() throws ServiceException{
        if(service == null){
                System.out.println("This is my service");
                System.out.println(service);
        }
        return service.findAllMateriel();
    }
    
    public String createMateriel() throws ServiceException{
        service.createMateriel(materiel);
        materiel=new  Materiel();
        return "create";
    }
    
    public String updateMateriel() throws ServiceException{
        System.out.println(materiel);
        service.updateMateriel(materiel);
        materiel=new  Materiel();
        return "update";
    }
    
    public String deleteMateriel() throws ServiceException{
        System.out.println("le Materiel");
        System.out.println(materiel);
        service.deleteMateriel(materiel.getId());
        materiel=new Materiel();
        return "supprimer";
    }
    
}
