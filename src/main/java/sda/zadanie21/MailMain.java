package sda.zadanie21;

import org.apache.commons.mail.EmailException;

public class MailMain {
    public static void main(String[] args) {
        try {
            MailSender.sendSimpleMail("djawny@op.pl", "hi", "Przykladowa wiadomosc.");
        } catch (EmailException e) {
            System.out.println("Blad wyslania emaila!");
        }

        try {
            MailSender.sendMailWithAttachment("javandwro1@gmail.com",
                    "Hi","Nice animal.","drink.jpg");
        } catch (EmailException e) {
            System.out.println("Blad wyslania emaila!");
        }
    }
}
