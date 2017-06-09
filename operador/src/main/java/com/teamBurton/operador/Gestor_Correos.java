package com.teamBurton.operador;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Gestor_Correos implements Gestor_correo {

	private final Properties properties = new Properties();

	private String password;

	private Session session;

	private void init() {

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.stmp.user", "username");

		/*
		 * //To use TLS props.put("mail.smtp.auth", "true");
		 * props.put("mail.smtp.starttls.enable", "true");
		 * props.put("mail.smtp.password", "opticometria");
		 */

		// To use SSL
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("teamburton96@gmail.com", "opticometria");// Specify
			}
		});
	}

	public Boolean enviar_correo_recuperacion(String email, String password) {
		init();
		String from = "teamburton96@gmail.com";
        String subject = "Recuperacion de contraseña";
        Message msg = new MimeMessage(session);
        try {
            msg.setFrom(new InternetAddress(from));
            msg.setRecipient(Message.RecipientType.TO, 
                new InternetAddress(email));
            msg.setSubject(subject);
            msg.setText(" Hola " + email + ", \n \n Hemos recibido una petición de "
            		+ "recuperación de contraseña para su cuenta, "
            		+ "su contraseña actual es " + password +"\n\n \n Si no ha solicitado"
            				+ " recuperar su contraseña, "
            				+ "puede ponerse en contacto con nuestro soporte técnico teamburton96@gmail.com.");
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com" , 465 , "username", "password");
            transport.send(msg);
            return true;
        }
        catch(Exception exc) {
            System.out.println(exc);
            return false;
        }
        
    }

	public boolean enviar_correo_registro_password(String email, String password) {
		init();
		String from = "teamburton96@gmail.com";
        String subject = "Registro completado";
        Message msg = new MimeMessage(session);
        try {
            msg.setFrom(new InternetAddress(from));
            msg.setRecipient(Message.RecipientType.TO, 
                new InternetAddress(email));
            msg.setSubject(subject);
            msg.setText(" Hola " + email + ", \n \n Su registro ha sido completado satisfactoriamente, "
            		   		+ "su contraseña para iniciar sesión es " + password +"\n\n \n Si no ha solicitado"
            				+ " registrarse en nuestro sistema, " +
            				" por favor elimine este email. \n\n "
            				+ "Si necesita cualquier información, puede ponerse en contacto con nuestro soporte técnico"
            				+ " a través del email teamburton96@gmail.com.");
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com" , 465 , "username", "password");
            transport.send(msg);
            return true;
        }
        catch(Exception exc) {
            System.out.println(exc);
            return false;
        }
	}
}