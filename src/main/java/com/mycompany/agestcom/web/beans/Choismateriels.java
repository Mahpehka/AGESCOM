/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.web.beans;

import com.mycompany.agestcom.data.Materiel;

/**
 *
 * @author root
 */
public class Choismateriels {
    
    private Materiel materiels;
    
    private int qte;

    public Materiel getMateriels() {
        return materiels;
    }

    public void setMateriels(Materiel materiels) {
        this.materiels = materiels;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
    
    
    
}
