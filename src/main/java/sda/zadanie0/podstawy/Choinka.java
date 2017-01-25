package sda.zadanie0.podstawy;


import java.util.Scanner;

public class Choinka {
    public static void main(String[] args) {
        System.out.println("Podaj wysokoscChoinki choinki:");
        int wysokoscChoinki = new Scanner(System.in).nextInt();

        for (int licznikWierszy = 0; licznikWierszy < wysokoscChoinki; licznikWierszy++) {
            for (int licznikKolumn = 0; licznikKolumn < wysokoscChoinki - licznikWierszy; licznikKolumn++) {
                System.out.print(" ");
            }
            for (int licznikSpacji = 0; licznikSpacji < 2 * licznikWierszy + 1; licznikSpacji++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
