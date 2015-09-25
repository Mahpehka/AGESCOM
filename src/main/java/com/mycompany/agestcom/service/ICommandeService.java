/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agestcom.service;

import com.mycompany.agestcom.data.Commande;
import java.util.List;

/**
 *
 * @author root
 */
public interface ICommandeService {
    
     public Commande createCommande(Commande commande);
    public Commande updateCommande(Commande commande);
    public Commande findCommandeById(Long id);
    public List<Commande> findAllCommande();
    public void deleteCommande(Long id);
    
}
