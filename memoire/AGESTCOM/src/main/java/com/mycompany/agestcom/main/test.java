package com.mycompany.agestcom.main;

import com.douwe.generic.dao.DataAccessException;
import com.douwe.generic.dao.impl.GenericDao;
import com.mycompany.agestcom.dao.IFournisseurDao;
import com.mycompany.agestcom.dao.ILivraisonDao;
import com.mycompany.agestcom.dao.Impl.FournisseurDaoImpl;
import com.mycompany.agestcom.dao.Impl.LivraisonDaoImpl;
import com.mycompany.agestcom.data.Fournisseur;
import com.mycompany.agestcom.data.Livraison;
import com.mycompany.agestcom.data.Materiel;
import com.mycompany.agestcom.data.Personne;
import com.mycompany.agestcom.service.ICommandeService;
import com.mycompany.agestcom.service.IFournisseurService;
import com.mycompany.agestcom.service.ILivraisonService;
import com.mycompany.agestcom.service.IMaterielServcice;
import com.mycompany.agestcom.service.IPersonneService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author root
 */
public class test {
    public static void main(String[] args) throws DataAccessException{
        System.out.println("bjr toi!!");
       // EntityManagerFactory emf= new Persistence.c
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("zozoPU");
//        EntityManager em= emf.createEntityManager();
//        IFournisseurDao fournisseur= new FournisseurDaoImpl();
//        ILivraisonDao livraison= new LivraisonDaoImpl();
//        ((GenericDao) livraison ).setManager(em);
//        ((GenericDao) fournisseur).setManager(em);
//        System.out.println("iiiiiiiiiiii");
//        EntityTransaction tx= em.getTransaction();
//        tx.begin();
//        
//        Fournisseur f=new Fournisseur();
//        f.setEmail("mpk@yahoo.fr");
//        f.setNom("kodjo");
//        f.setTel("357890");
//        fournisseur.create(f);
//        
////        Livraison liv=new  Livraison();
////        liv.setN_bon_livraison("12.1");
////        liv.setDate_livraison("12-2016-28");
////        liv.set
//        
//        System.out.println("f");
//        


//        
//        tx.commit();
//        
    
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        ILivraisonService service = ctx.getBean("ILivraisonService", ILivraisonService.class);
        IFournisseurService servic = ctx.getBean("IFournisseurService", IFournisseurService.class);
     
        
        Fournisseur four =  new Fournisseur();
        Livraison liv = service.findLivraisonById(1L);
        four.setEmail("mpk@yahoo.fr");
        four.setNom("mimi");
        four.setTel("670041407");
        
        List<Livraison> list = new ArrayList<Livraison>();
        Livraison livraison= new Livraison();
        livraison.setN_bon_livraison(28L);
        livraison.setStatus_livraison("bonne");
        livraison.setDate_livraison(new Date());
        service.createLivraison(livraison);
        list.add(livraison);

         servic.createFournisseur(four);
         System.out.println("" + four.getNom());
       
        
    }
    
}
