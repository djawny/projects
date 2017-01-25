package sda.zadanie4_przeslanianie_kolekcje_zbiory_listy_mapy_wyjatki;

import java.util.Scanner;


public class Main3 {
    public static void main(String[] args) {

        //WYJATKI
        Test test = new Test();

        System.out.println("Podaj dwie liczby do dzielenia x/y: ");
        System.out.println("Podaj x:");
        double x = new Scanner(System.in).nextDouble();

        boolean shouldReplay = false;
        do {
            System.out.println("Podaj y:");
            double y = new Scanner(System.in).nextDouble();

            try {
                double divide = test.divide(x, y);
                System.out.println("Wynik dzielenia: " + divide);
                shouldReplay = false;
            } catch (Exception e) {
                shouldReplay = true;
                System.out.println(e.getMessage());
                            }
        } while (shouldReplay);

    }
}
