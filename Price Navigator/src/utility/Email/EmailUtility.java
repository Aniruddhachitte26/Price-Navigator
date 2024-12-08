/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility.Email;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

/**
 *
 * @author Aniruddha
 */
public class EmailUtility {
    
    public static void sendEmail(String recipientEmail, String subject, String content) {
        // Sender's email credentials and host configuration might be better placed in a configuration file
        final String from = "pricenavigator1@gmail.com"; // Replace with sender's email
        final String host = "smtp.gmail.com"; // Replace with the SMTP host
        final String username = "pricenavigator1@gmail.com"; // Replace with username
        final String password = "xyuz apep ozln klyb"; // Replace with password

        // Setup properties for the mail session
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465"); // Replace if needed
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Create a session with an Authenticator
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a MIME style email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            message.setSubject(subject);
            message.setText(content);

            // Send the email
            Transport.send(message);
            System.out.println("Sent email successfully to " + recipientEmail);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
    
}
