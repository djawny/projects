package sdajava.podstawy;

import java.util.Scanner;

public class Dodawanie2Tablic {
    public static void main(String[] args) {

        System.out.println("Podaj wielkosc 1 tablicy:");
        int wielkoscTab1 = new Scanner(System.in).nextInt();

        System.out.println("Podaj wielkosc 2 tablicy:");
        int wielkoscTab2 = new Scanner(System.in).nextInt();

        int[] tab1 = new int[wielkoscTab1];
        int[] tab2 = new int[wielkoscTab2];
        System.out.println("Wypelnij 1 tablice:");
        for (int i = 0; i < tab1.length; i++) {
            System.out.print("tab1[" + i + "]=");
            tab1[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("Wypelnij 2 tablice:");
        for (int i = 0; i < tab2.length; i++) {
            System.out.print("tab2[" + i + "]=");
            tab2[i] = new Scanner(System.in).nextInt();
        }

        int wielkoscTabSumy;
        int wielkoscMniejszejTab;

        if (wielkoscTab1 >= wielkoscTab2) {
            wielkoscTabSumy = wielkoscTab1;
            wielkoscMniejszejTab = wielkoscTab2;

        } else {
            wielkoscTabSumy = wielkoscTab2;
            wielkoscMniejszejTab = wielkoscTab1;
        }

        int[] tabSumy = new int[wielkoscTabSumy];

        for (int i = 0; i < wielkoscMniejszejTab; i++) {
            tabSumy[i] = tab1[i] + tab2[i];
        }

        for (int i = wielkoscMniejszejTab; i < tabSumy.length; i++) {
            if (wielkoscTab1 > wielkoscTab2) tabSumy[i] = tab1[i];
            else tabSumy[i] = tab2[i];
        }

        for (int i = 0; i < tabSumy.length; i++) {
            System.out.println(" " + tabSumy[i]);
        }
    }
}
