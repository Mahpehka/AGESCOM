package com.mycompany.agestcom.main;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.agestcom.data.Fournisseur;
import com.mycompany.agestcom.data.Livraison;
import com.mycompany.agestcom.data.Personne;
import com.mycompany.agestcom.service.IFournisseurService;
import com.mycompany.agestcom.service.IPersonneService;
import com.mycompany.agestcom.service.ILivraisonService;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author root
 */
public class test {
    public static void main(String[] args) throws DataAccessException{
        System.out.println("bjr toi!!");
//       // EntityManagerFactory emf= new Persistence.c
////        EntityManagerFactory emf = Persistence.createEntityManagerFactory("zozoPU");
////        EntityManager em= emf.createEntityManager();
////        IFournisseurDao fournisseur= new FournisseurDaoImpl();
////        ILivraisonDao livraison= new LivraisonDaoImpl();
////        ((GenericDao) livraison ).setManager(em);
////        ((GenericDao) fournisseur).setManager(em);
////        System.out.println("iiiiiiiiiiii");
////        EntityTransaction tx= em.getTransaction();
////        tx.begin();
////        
////        Fournisseur f=new Fournisseur();
////        f.setEmail("mpk@yahoo.fr");
////        f.setNom("kodjo");
////        f.setTel("357890");
////        fournisseur.create(f);
////        
//////        Livraison liv=new  Livraison();
//////        liv.setN_bon_livraison("12.1");
//////        liv.setDate_livraison("12-2016-28");
//////        liv.set
////        
////        System.out.println("f");
////        
//
//
////        
////        tx.commit();
////        
//    
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        //ILivraisonService service = ctx.getBean("ILivraisonService", ILivraisonService.class);
//        IFournisseurService servic = ctx.getBean("IFournisseurService", IFournisseurService.class);
//     
//        
//        Fournisseur four =  new Fournisseur();
//        //Livraison liv = service.findLivraisonById(1L);
//        four.setEmail("mpk@yahoo.fr");
//        four.setNom("mimi");
//        four.setTel("670041407");
//        
////        List<Livraison> list = new ArrayList<Livraison>();
////        Livraison livraison= new Livraison();
////        livraison.setN_bon_livraison(28L);
////        livraison.setStatus_livraison("bonne");
////        livraison.setDate_livraison(new Date());
////        service.createLivraison(livraison);
////        list.add(livraison);
//
//         servic.createFournisseur(four);
//         System.out.println("" + four.getNom());
           email();
        
    }
    public static void email(){
        
        Properties properties = new Properties();

<<<<<<< HEAD
        properties.put("mail.smtp.host", "smtp.gmail.com");
        
        properties.put("mail.smtp.starttls.enable", "true");
        
        properties.put("mail.smtp.port", "587");
=======
//        
//        tx.commit();
//        
    
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        ILivraisonService service = ctx.getBean("ILivraisonService", ILivraisonService.class);
        IFournisseurService servic = ctx.getBean("IFournisseurService", IFournisseurService.class);
        IPersonneService ser = ctx.getBean("IPersonneService", IPersonneService.class);

        
        Personne per=new Personne();
        per.setLogin("mpk");
        per.setMatricule("12XO3");
        per.setNom("kodjoe");
        per.setPassword("rien");
        ser.createPersonne(per);
//        Fournisseur four =  new Fournisseur();
//        Livraison liv = service.findLivraisonById(1L);
//        four.setEmail("mpk@yahoo.fr");
//        four.setNom("mimi");
//        four.setTel("670041407");
>>>>>>> b34347c3983ca268bee4f4323fb93b7312ea5dee
        
        //properties.put("mail.smtp.starttls.enable", "true");

         Session session = Session.getInstance(properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("sabc.truth@gmail.com","brasserie");
                    }
                });
        System.out.println("session a donnée");
        MimeMessage message = new MimeMessage(session); 

        try {

            message.setText("Alerte");

            message.setSubject("essai");

            message.setFrom(new InternetAddress("sabc.truth@gmail.com"));
            
            message.setRecipients(javax.mail.Message.RecipientType.TO, InternetAddress.parse("wtakoutsing@gmail.com"));

          //System.out.println("ajout des destinataire du message");
        } catch (MessagingException e) {

<<<<<<< HEAD
            e.printStackTrace();
        }
=======
         //servic.createFournisseur(four);
         System.out.println("" + ser.findAllPersonne().size());
       
>>>>>>> b34347c3983ca268bee4f4323fb93b7312ea5dee
        
        //System.out.println("on essaye d'envoyer le message");
        try {
            Transport transport = session.getTransport("smtp");
            transport.connect("sabc.truth@gmail.com", "brasserie");
            transport.sendMessage(message, new Address[] { new InternetAddress("wtakoutsing@gmail.com"),new InternetAddress("wtakoutsing@gmail.com") }); 
          //System.out.println("le message est parti");
            
        } catch (MessagingException ex) {
            System.out.println("echec lors de l'envoi");
        }
    }
    
}
