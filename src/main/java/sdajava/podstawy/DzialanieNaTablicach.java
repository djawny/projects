package sdajava.podstawy;

import java.util.Random;
import java.util.Scanner;

public class DzialanieNaTablicach {
    public static void main(String[] args) {

        System.out.println("Podaj dlugosc tablicy do wypelnienia:");
        int dlugoscTablicy = new Scanner(System.in).nextInt();

        int[] tworzonaTablica = new int[dlugoscTablicy];
        for (int i = 0; i < tworzonaTablica.length; i++) {
            if (i % 2 == 0) tworzonaTablica[i] = i + 1;
            else tworzonaTablica[i] = -(i + 1);
        }
        for (int i = 0; i < tworzonaTablica.length; i++) {
            System.out.print(" " + tworzonaTablica[i]);
        }

        System.out.println();
        for (int i = 0; i < tworzonaTablica.length; i++) {
            tworzonaTablica[i] = i * i;
        }
        for (int i = 0; i < tworzonaTablica.length; i++) {
            System.out.print(" " + tworzonaTablica[i]);
        }

        System.out.println();
        int[] tablicaLosowa = new int[10];
        for (int i = 0; i < tablicaLosowa.length; i++) {
            tablicaLosowa[i] = new Random().nextInt();
            System.out.print(" " + tablicaLosowa[i]);
        }

    }
}
