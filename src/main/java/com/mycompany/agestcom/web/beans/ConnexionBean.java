/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Personne;
import com.mycompany.agestcom.service.IPersonneService;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ConnexionBean {
 
    private String login= new String();
    private String password = new String();
    
    @ManagedProperty(value = "#{IPersonneService}")
    IPersonneService iPersonneService;
    
    private Personne personne = new Personne();

    
    public IPersonneService getiPersonneService() {
        return iPersonneService;
    }

    public void setiPersonneService(IPersonneService iPersonneService) {
        this.iPersonneService = iPersonneService;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
    
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public ConnexionBean() {
      
    }
    
    public String seconnecter(){
        
//        List<Personne>  personnes = new LinkedList<Personne>();
//        
//        personnes = iPersonneService.findAllPersonne();
//        for (Personne personne1 : personnes) {
//            if(personne1.getLogin().compareTo(login)==0){
//                personne= personne1;
//                break;
//            }
//        }
//        
         try {
           /* System.out.println("Bonjour ++++++++++++++++++++++Kodjo");
            List<Personne> list = iPersonneService.findAllPersonne();
            
            for (Personne list1 : list) {
                if((list1.getLogin().equals(personne.getLogin()))&&(list1.getPassword().equals(personne.getPassword()))){
                    return "Demande.xhtml";
                }
            }*/
            
             return "templateWelcome.xhtml?faces-redirect=true";
           
        } catch (ServiceException ex) {
            Logger.getLogger(ConnexionBean.class.getName()).log(Level.SEVERE, null, ex);
          
   }
         return null;
    }
}
