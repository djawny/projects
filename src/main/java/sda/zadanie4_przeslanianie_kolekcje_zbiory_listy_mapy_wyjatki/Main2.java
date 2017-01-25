package sda.zadanie4_przeslanianie_kolekcje_zbiory_listy_mapy_wyjatki;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        //MAPY
        Map<String, String> stringStringHashMap = new HashMap<>();
        boolean index = true;
        do {
            System.out.println("Chcesz dodac element do mapy T/N: ");
            String str = new Scanner(System.in).nextLine();
            switch (str) {
                case "T":
                    System.out.println("Podaj key: ");
                    String key = new Scanner(System.in).nextLine();
                    System.out.println("Podaj value: ");
                    String value = new Scanner(System.in).nextLine();
                    stringStringHashMap.put(key, value);
                    break;
                case "N":
                    index = false;
                    break;
                default:
                    System.out.println("Zla odpowiedz.");
                    break;
            }
        } while (index);
        for (Map.Entry<String, String> entry : stringStringHashMap.entrySet()) {
            System.out.println("Klucz: " + entry.getKey() + " Wartosc: " + entry.getValue());
        }

    }
}
