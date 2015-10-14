package com.mycompany.agestcom.main;

import com.douwe.generic.dao.DataAccessException;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author root
 */
public class test {
    public static void main(String[] args) throws DataAccessException{
        System.out.println("bjr toi!!");

           email();
        
    }
    public static void email(){
        
        Properties properties = new Properties();

        properties.put("mail.smtp.host", "smtp.gmail.com");
        
        properties.put("mail.smtp.starttls.enable", "true");
        
        properties.put("mail.smtp.port", "587");

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

     
        } catch (MessagingException e) {


        }

         
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
