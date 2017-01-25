package sda.zadanie0.podstawy;

import java.util.Scanner;

public class Fraktal {
    public static void main(String[] args) {

        System.out.println("Podaj wielkosc planszy (liczba nieparzysta):");
        int wielkoscPlanszy = new Scanner(System.in).nextInt();

        boolean[][] plansza = new boolean[wielkoscPlanszy][wielkoscPlanszy];

        int pozNaPlanszyX = wielkoscPlanszy / 2;
        int pozNaPlanszyY = wielkoscPlanszy / 2;
        int iloscRuchow = 1;
        int wyborKierunku = 0;

        plansza[pozNaPlanszyX][pozNaPlanszyY] = true;
        while (iloscRuchow++ < wielkoscPlanszy - 1) {
            for (int i = 1; i < iloscRuchow; i++) {

                if (wyborKierunku % 4 == 0) {
                    plansza[++pozNaPlanszyX][pozNaPlanszyY] = true;
                }
                if (wyborKierunku % 4 == 1) {
                    plansza[pozNaPlanszyX][++pozNaPlanszyY] = true;
                }
                if (wyborKierunku % 4 == 2) {
                    plansza[--pozNaPlanszyX][pozNaPlanszyY] = true;
                }
                if (wyborKierunku % 4 == 3) {
                    plansza[pozNaPlanszyX][--pozNaPlanszyY] = true;
                }
            }
            System.out.println("Fraktal:");
            for (int i = 0; i < wielkoscPlanszy; i++) {
                for (int j = 0; j < wielkoscPlanszy; j++) {
                    if (plansza[i][j]) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            wyborKierunku++;
        }
    }
}
