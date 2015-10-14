/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.data.Fournisseur;
import com.mycompany.agestcom.service.IFournisseurService;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.primefaces.model.SelectableDataModel;


/**
 *
 * @author root
 */
@ManagedBean
@RequestScoped 
public class FournisseurBean implements SelectableDataModel<Fournisseur>{

    @ManagedProperty(value = "#{IFournisseurService}")
    IFournisseurService iFournisseurService;
    
    private Fournisseur fournisseur = new Fournisseur();
    
    private List<Fournisseur> fournisseurs = new LinkedList<Fournisseur>();
    
    private String msg = new String();

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
   
    public List<Fournisseur> getFournisseurs() {
        try {
            fournisseurs = iFournisseurService.findAllFournisseurs();
        } catch (DataAccessException ex) {
            Logger.getLogger(FournisseurBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fournisseurs;
    }

    public void setFournisseurs(List<Fournisseur> fournisseurs) {
        this.fournisseurs = fournisseurs;
    }
    
    public IFournisseurService getiFournisseurService() {
        return iFournisseurService;
    }

    public void setiFournisseurService(IFournisseurService iFournisseurService) {
        this.iFournisseurService = iFournisseurService;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        System.out.println(fournisseur);
        this.fournisseur = fournisseur;
    }
    
    public void save(){
        
        try {
            iFournisseurService.createFournisseur(fournisseur);
        } catch (DataAccessException ex) {
            Logger.getLogger(FournisseurBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            iFournisseurService.updateFournisseur(fournisseur);
        } catch (DataAccessException ex) {
            Logger.getLogger(FournisseurBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Override
    public Object getRowKey(Fournisseur t) {
        return t.getId();
        }

    public Fournisseur getRowData(String rowKey) {
        
        List<Fournisseur> ag = getFournisseurs();
        for (Fournisseur entre : ag) {
            if (entre.getId().equals(rowKey)) {
                return entre;
            }
        }
        return null;
        }
    
    public void email(){
        
//        Properties properties = new Properties();
//
//        properties.put("mail.smtp.host", "smtp.gmail.com");
//        
//        properties.put("mail.smtp.starttls.enable", "true");
//        
//        properties.put("mail.smtp.port", "587");
//        
//        //properties.put("mail.smtp.starttls.enable", "true");
//
//         Session session = Session.getInstance(properties,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication("sabc.truth@gmail.com","brasserie");
//                    }
//                });
//        System.out.println("session a donnée");
//        MimeMessage message = new MimeMessage(session); 
//
//        try {
//
//            message.setText("Alerte");
//
//            message.setSubject(msg);
//
//            message.setFrom(new InternetAddress("sabc.truth@gmail.com"));
//            
//            message.setRecipients(javax.mail.Message.RecipientType.TO, InternetAddress.parse(fournisseur.getEmail()));
//
//          //System.out.println("ajout des destinataire du message");
//        } catch (MessagingException e) {
//
//            e.printStackTrace();
//        }
//        
//        //System.out.println("on essaye d'envoyer le message");
//        try {
//            Transport transport = session.getTransport("smtp");
//            transport.connect("sabc.truth@gmail.com", "brasserie");
//            transport.sendMessage(message, new Address[] { new InternetAddress(fournisseur.getEmail()),new InternetAddress(fournisseur.getEmail()) }); 
//          //System.out.println("le message est parti");
//            
//        } catch (MessagingException ex) {
//            System.out.println("echec lors de l'envoi");
//        }
        System.out.println("test");
    }
    
}
