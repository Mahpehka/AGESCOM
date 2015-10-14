/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Materiel;
import com.mycompany.agestcom.data.Sortie;
import com.mycompany.agestcom.data.TypeSortie;
import com.mycompany.agestcom.service.ISortieService;
import com.mycompany.agestcom.service.IMaterielService;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author root
 */
@ManagedBean
@RequestScoped
public class SortieBean {

     @ManagedProperty(value = "#{ISortieService}")
     ISortieService iSortieService;
     
      @ManagedProperty(value = "#{IMaterielService}")
     IMaterielService iMaterielService;
     
   //  private List<Materiel> listeMateriels;
     
    private List<Materiel> listeMateriels = new ArrayList<Materiel>();
     
     Materiel materiel=new  Materiel();
     
     Sortie sortie= new  Sortie();
     
     private Long idmatos;
     
     private Long tab[];
   
    public SortieBean() {
        idmatos = 0L;
        tab = new Long[5];
    }

    public Long[] getTab() {
        return tab;
    }

    public void setTab(Long[] tab) {
        this.tab = tab;
    }
    
    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }
    
    
    public List<Materiel> getListeMateriels() {
        return iMaterielService.findAllMateriel();
    }

    public void setListeMateriels(List<Materiel> listeMateriels) {
        this.listeMateriels = listeMateriels;
    }

    
    
    public ISortieService getiSortieService() {
        return iSortieService;
    }

    public void setiSortieService(ISortieService iSortieService) {
        this.iSortieService = iSortieService;
    }

    public Sortie getSortie() {
        return sortie;
    }

    public void setSortie(Sortie sortie) {
        this.sortie = sortie;
    }
    
    public Sortie createSortie(){
      listeMateriels=new  ArrayList<Materiel>();
        for(int i = 0; i < tab.length; i++) {
                Long t = tab[i];
                Materiel mat;
                System.out.println("-----------" + t);
                mat = iMaterielService.findFMaterielById(t);
                //iMaterielService.updateMateriel(materiel);
                listeMateriels.add(mat);
            }
        
        sortie.setMateriels(listeMateriels);
        return iSortieService.createSortie(sortie);
    }
    public  Sortie updateSortie(){
      return iSortieService.updateSortie(sortie);
    }
    public  Sortie findSortieById(){
      return iSortieService.findSortieById(sortie.getId());
    }
   
    public List<Sortie> findAllsortie(){
      return iSortieService.findAllSortie();
    }
   
    public List getTypeSortie() {
        List<TypeSortie> result = new ArrayList<TypeSortie>();
        result.add(TypeSortie.cession);
        result.add(TypeSortie.reforme);
        return result;
    }

    public Long getIdmatos() {
        return idmatos;
    }

    public void setIdmatos(Long idmatos) {
        this.idmatos = idmatos;
    }

    public IMaterielService getiMaterielService() {
        return iMaterielService;
    }

    public void setiMaterielService(IMaterielService iMaterielService) {
        this.iMaterielService = iMaterielService;
    }
    
    
}
