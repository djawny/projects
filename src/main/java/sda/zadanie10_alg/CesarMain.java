package sda.zadanie10_alg;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CesarMain {
    public static void main(String[] args) {

        int offset = 50;

        if (args.length == 0) {
            System.err.print("Nie podałeś parametru!!!");
            System.exit(1);
        }

        try {
            String text = DataFileReader.readFileAsString(args[1]);
            if (args[0].equals("encrypt")) {
                System.out.println("Tekst do zaszyfrowania: " + text);
                String encryptedText = CaesarEncrypting.encrypt(text, offset);
                System.out.println("Zaszyfrowany tekst: " + encryptedText);
                DataFileWriter.saveStringToFile(encryptedText, args[2]);
            } else if (args[0].equals("decrypt")) {
                System.out.println("Tekst do odszyfrownia: " + text);
                String decryptedText = CaesarEncrypting.decrypt(text, offset);
                System.out.println("Odszyfrowany tekst: " + decryptedText);
                DataFileWriter.saveStringToFile(text, args[2]);
            } else {
                System.out.println("Bledne parametry wywolania.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
