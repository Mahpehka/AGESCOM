/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import com.mycompany.agestcom.service.IFiche_detenteurService;
import java.util.List;
import com.mycompany.agestcom.service.IPersonneService;
import com.mycompany.agestcom.service.IMaterielService;
import com.mycompany.agestcom.data.Materiel;
import com.mycompany.agestcom.data.Fiche_detenteur;
import com.mycompany.agestcom.data.Personne;
import java.util.ArrayList;
/**
 *
 * @author root
 */
@ManagedBean
@RequestScoped
public class Fiche_detenteurBean {

    @ManagedProperty(value = "#{IFiche_detenteurService}")
    IFiche_detenteurService iFiche_detenteurService;
    
    @ManagedProperty(value = "#{IPersonneService}")
    IPersonneService iPersonneService;
    
     @ManagedProperty(value = "#{IMaterielService}")
     IMaterielService iMaterielService;
       
    private Fiche_detenteur fiche_detenteur = new Fiche_detenteur();
    private List<Materiel> listeMateriels;
    private List<Personne> listePersonnes;
    Long idmateriel;
    Long idpersonne;
    Long idpersonnes;
    String nom_entre;
    private Long tab [];
    public Fiche_detenteurBean() {
        idmateriel=0L;
        idpersonne = 0L;
        idpersonnes=0L;
        tab= new Long[5];
    }
    

    public IFiche_detenteurService getiFiche_detenteurService() {
        return iFiche_detenteurService;
    }

    public void setiFiche_detenteurService(IFiche_detenteurService iFiche_detenteurService) {
        this.iFiche_detenteurService = iFiche_detenteurService;
    }

    public Fiche_detenteur getFiche_detenteur() {
        return fiche_detenteur;
    }

    public void setFiche_detenteur(Fiche_detenteur fiche_detenteur) {
        this.fiche_detenteur = fiche_detenteur;
    }

    

    public List<Materiel> getListeMateriels() {
        return iMaterielService.findAllMateriel();
    }

    public void setListeMateriels(List<Materiel> listeMateriels) {
        this.listeMateriels = listeMateriels;
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
    
     
     public Fiche_detenteur createFiche_detenteur(){
      listeMateriels=new  ArrayList<Materiel>();
      
      Personne personne = iPersonneService.findPersonneById(idpersonne);
      fiche_detenteur.setPersonne(personne);
         for (int i = 0; i < tab.length; i++) {
             Materiel materiel=new  Materiel();
             Long v=tab[i];
             materiel=iMaterielService.findFMaterielById(v);
             listeMateriels.add(materiel);
              }
       fiche_detenteur.setMateriels(listeMateriels);
       return iFiche_detenteurService.createFiche_detenteur(fiche_detenteur);
      
     
    }
    public  Fiche_detenteur updateFiche_detenteur(){
     listeMateriels=new  ArrayList<Materiel>();
      
      Personne personne = iPersonneService.findPersonneById(idpersonne);
      fiche_detenteur.setPersonne(personne);
         for (int i = 0; i < tab.length; i++) {
             Materiel materiel=new  Materiel();
             Long v=tab[i];
             materiel=iMaterielService.findFMaterielById(v);
             listeMateriels.add(materiel);
              }
       fiche_detenteur.setMateriels(listeMateriels);
      return iFiche_detenteurService.updateFiche_detenteur(fiche_detenteur);
    }
    public  Fiche_detenteur findFiche_detenteurById(){
      return iFiche_detenteurService.findFiche_detenteurById(fiche_detenteur.getId());
    }
   
    public List<Fiche_detenteur> findAllFiche_detenteurs(){
      return iFiche_detenteurService.findAllFiche_detenteurs();
    }

    public IPersonneService getiPersonneService() {
        return iPersonneService;
    }

    public void setiPersonneService(IPersonneService iPersonneService) {
        this.iPersonneService = iPersonneService;
    }

    public List<Personne> getListePersonnes() {
        
        return iPersonneService.findAllPersonne();
    }

    public void setListePersonnes(List<Personne> listePersonnes) {
        this.listePersonnes = listePersonnes;
    }

    public Long getIdpersonne() {
        return idpersonne;
    }

    public void setIdpersonne(Long idpersonne) {
        this.idpersonne = idpersonne;
    }

    public IMaterielService getiMaterielService() {
        return iMaterielService;
    }

    public void setiMaterielService(IMaterielService iMaterielService) {
        this.iMaterielService = iMaterielService;
    }

    public String getNom_entre() {
        return nom_entre;
    }

    public void setNom_entre(String nom_entre) {
        this.nom_entre = nom_entre;
    }

    public Long getIdpersonnes() {
        return idpersonnes;
    }

    public void setIdpersonnes(Long idpersonnes) {
        this.idpersonnes = idpersonnes;
    }
    
    
    
    public List<Materiel> filtreur(){
        
     List<Materiel>  listesmatMateriels = new ArrayList<Materiel>();
        List<Fiche_detenteur> listefFiche_detenteurs =new ArrayList<Fiche_detenteur>();
        System.out.println("===================================================================== " + idpersonnes);
        Personne personnes = iPersonneService.findPersonneById(idpersonnes);
        
        listefFiche_detenteurs=iFiche_detenteurService.findAllFiche_detenteurs();
        
        for (Fiche_detenteur li_detenteurstefFiche : listefFiche_detenteurs) {
            Personne personne = li_detenteurstefFiche.getPersonne();
           // System.out.println("personne                    ====       personnes" + personnes.getLogin());
//            if(personne.getNom().equals(personnes.getNom())){
//               List<Materiel> listem = new ArrayList<Materiel>();
//               listem = li_detenteurstefFiche.getMateriels();
//                for (Materiel listem1 : listem) {
//                    listesmatMateriels.add(listem1);
//                }
//            }
        }
        return listesmatMateriels;
    }
    
    public String fonctions(){
        System.out.println("bonjour Mako    ===================================  bonne nuit");
      return  "listes"; 
    }
    
    
}
