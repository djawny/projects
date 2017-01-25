package sdajava.podstawy;

import java.util.Scanner;

public class MiejscaZeroweFunkcjiKwadratowej {
    public static void main(String[] args) {

        System.out.println("Podaj dane funkcji kwadratowej.");
        System.out.println("Podaj A= ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Podaj B= ");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Podaj C= ");
        double c = new Scanner(System.in).nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.println("Wynik:");
        if (delta < 0) {
            System.out.println("Nie ma miejsc zerowych");
        } else if (delta == 0) {
            double x=(-b/(2*a));
            System.out.println("Jest jedno miejsce zerowe x= " + x);
        } else {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Sa 2 miejsca zerowe x1=" + x1 + " x2=" + x2);
        }
    }
}
