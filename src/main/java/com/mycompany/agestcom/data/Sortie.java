/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.data;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author root
 */
@Entity
public abstract class Sortie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long N_orde_sortie;
   

    public Long getN_orde_sortie() {
        return N_orde_sortie;
    }

    public void setN_orde_sortie(Long N_orde_sortie) {
        this.N_orde_sortie = N_orde_sortie;
    }


}
