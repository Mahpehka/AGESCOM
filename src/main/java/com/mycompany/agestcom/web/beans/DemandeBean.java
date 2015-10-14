/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Demande;

import com.mycompany.agestcom.data.Materiel;
import com.mycompany.agestcom.data.Personne;
import com.mycompany.agestcom.service.IDemandeService;
import com.mycompany.agestcom.service.IPersonneService;
import com.mycompany.agestcom.service.IMaterielService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author root
 */
@ManagedBean
@SessionScoped
public class DemandeBean {

    @ManagedProperty(value = "#{IDemandeService}")
    IDemandeService iDemandeService;
    
    @ManagedProperty(value = "#{IPersonneService}")
    IPersonneService iPersonneService;
    
    @ManagedProperty(value = "#{IMaterielService}")
     IMaterielService iMaterielService;

    private List<Materiel> listeMateriels = new ArrayList<Materiel>();
    
    private List<Materiel> listeMaterielses;
    
    private List<Choismateriels> choiList = new ArrayList<Choismateriels>();
    
    private Choismateriels choismateriels;
    
    private int qtetotal= 0;
    
    Long idmateriel;
    private Long tab[];
    private Date date;
    Long idpersonne;
    Long idmotos;
    private int qte;
    private List<Personne>listePersonnes;

    private  Demande  demande = new Demande();;

    public DemandeBean() {
        

        idpersonne = 0L;
        idmateriel = 0L;
        tab = new Long[5];
        idmotos = 0L;
    }

    public IDemandeService getiDemandeService() {
        return iDemandeService;
    }

    public void setiDemandeService(IDemandeService iDemandeService) {
        this.iDemandeService = iDemandeService;
    }

    public Demande getDemande() {
       
        return demande;
    }

    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    

    public Long getIdmateriel() {
        return idmateriel;
    }

    public void setIdmateriel(Long idmateriel) {
        this.idmateriel = idmateriel;
    }

    public Long[] getTab() {
        return tab;
    }

    public void setTab(Long[] tab) {
        this.tab = tab;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Personne> getListePersonnes() {
        return iPersonneService.findAllPersonne();
    }

    public void setListePersonnes(List<Personne> listePersonnes) {
        this.listePersonnes = listePersonnes;
    }

    public List<Materiel> getListeMateriels() {
        return iMaterielService.findAllMateriel();
    }

    public void setListeMateriels(List<Materiel> listeMateriels) {
        this.listeMateriels = listeMateriels;
    }

   
    
    public String createDemande() {
        Demande demande1=new  Demande();
        System.out.println("dhdkdkjd   kjdkdld  =========================================================================================== " + idpersonne );
        Personne personne = iPersonneService.findPersonneById(idpersonne);
        System.out.println(" oui ====================================================== " + personne.getMatricule());
        System.out.println("Je teste si demande est null");
        System.out.println(demande1);
        demande1.setPersonne(personne);
        if(listeMaterielses!=null){
        System.out.println(" oui ====================================================== " + personne.getMatricule());
        //demande1.setMateriels(listeMaterielses);
        }
        demande1.setQuantite(qtetotal);
        demande1.setDate(new Date());
        for (Materiel listeM: listeMaterielses) {
            System.out.println("liste "+listeM.getDesignation());   
        }
        iDemandeService.createDemande(demande1);
//        listeMaterielses =new  ArrayList<Materiel>();
        return "demande";
    }

    public Demande updateDemande() {
        return iDemandeService.updateDemande(demande);
    }

    public Demande findDemandeById() {
        return iDemandeService.findDemandeById(demande.getId());
    }

    public List<Demande> findAllDemande() {
        return iDemandeService.findAllDemande();
    }

    public String deleteDemande() {
        iDemandeService.deleteDemande(demande.getId());
        return "delete";
    }

    public Long getIdpersonne() {
        return idpersonne;
    }

    public void setIdpersonne(Long idpersonne) {
        this.idpersonne = idpersonne;
    }

    public IPersonneService getiPersonneService() {
        return iPersonneService;
    }

    public void setiPersonneService(IPersonneService iPersonneService) {
        this.iPersonneService = iPersonneService;
    }

    public IMaterielService getiMaterielService() {
        return iMaterielService;
    }

    public void setiMaterielService(IMaterielService iMaterielService) {
        this.iMaterielService = iMaterielService;
    }

    public List<Choismateriels> getChoiList() {
        return choiList;
    }

    public void setChoiList(List<Choismateriels> choiList) {
        this.choiList = choiList;
    }

    public Choismateriels getChoismateriels() {
        return choismateriels;
    }

    public void setChoismateriels(Choismateriels choismateriels) {
        this.choismateriels = choismateriels;
    }

    

    public Long getIdmotos() {
        return idmotos;
    }

    public void setIdmotos(Long idmotos) {
        this.idmotos = idmotos;
    }
    
    public List<Materiel>  listeur(){
      if(listeMaterielses == null){
        listeMaterielses = new ArrayList<Materiel>();
      }
      Materiel materiel = iMaterielService.findFMaterielById(idmotos);
      listeMaterielses.add(materiel);
      choismateriels = new Choismateriels();
      choismateriels.setMateriels(materiel);
      choismateriels.setQte(qte);
      choiList.add(choismateriels);
      qtetotal= qtetotal + qte;
      return listeMaterielses;
    
    }
    
    public List<Materiel> maliste(){
      return  listeMaterielses;
    
    }

    public List<Materiel> getListeMaterielses() {
        return listeMaterielses;
    }

    public void setListeMaterielses(List<Materiel> listeMaterielses) {
        this.listeMaterielses = listeMaterielses;
    }

    public int getQtetotal() {
        return qtetotal;
    }

    public void setQtetotal(int qtetotal) {
        this.qtetotal = qtetotal;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
    
}
