package sda.zadanie18_Joiner;

import org.apache.commons.mail.EmailException;

public class Main {
    public static void main(String[] args) {
        try {
            MailSender.sendSimpleMail("djawny@op.pl", "Odczytana wiadomosc",
                    MyFile.readMessageFromFile("test.txt"));
        } catch (EmailException e) {
            System.out.println("Blad wyslanie emaila!");
        }
    }
}
