package sda.zadanie21;

import org.apache.commons.mail.*;

public class MailSender {
    public static void sendSimpleMail(String address, String title, String content) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("javandwro1@gmail.com","javand1wro"));
        email.setSSLOnConnect(true);
        email.setFrom("javandwro1@gmail.com");
        email.setSubject(title);
        email.setMsg(content);
        email.addTo(address);
        email.send();
        System.out.println("Mail sent!");
    }
    public static void sendMailWithAttachment(String address, String title, String content,String attachmentPath) throws EmailException {
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath(attachmentPath);
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Drink");
        attachment.setName("Picture");

        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("javandwro1@gmail.com","javand1wro"));
        email.setSSLOnConnect(true);
        email.setFrom("javandwro1@gmail.com");
        email.setSubject(title);
        email.setMsg(content);
        email.addTo(address);
        email.attach(attachment);
        email.send();
        System.out.println("Mail sent!");
    }
}
