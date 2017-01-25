package sda.sdajava.podstawy;

import java.util.Scanner;

public class StaryKalkulator {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Podaj liczbę x: ");
            double x = (new Scanner(System.in)).nextDouble();
            System.out.println("Podaj liczbę y: ");
            double y = (new Scanner(System.in)).nextDouble();
            System.out.println("Jakie chcesz wykonać działanie? (1-dodawanie, 2-odejmowanie, 3-mnożenie, 4-dzielenie, 5-reszta z dzielenia):");
            int dzialanie = (new Scanner(System.in)).nextInt();

            // rozwiazanie 1
            double wynikDzialania = 0;

            switch (dzialanie) {
                case 1:
                    wynikDzialania = x + y;
                    break;
                case 2:
                    wynikDzialania = x - y;
                    break;
                case 3:
                    wynikDzialania = x * y;
                    break;
                case 4:
                    wynikDzialania = x / y;
                    break;
                case 5:
                    wynikDzialania = x % y;
                    break;
                default:
                    System.out.println("Podałeś niepoprawny kod działania");

            }

            System.out.println("Wynik: " + wynikDzialania);
        }
    }
}
