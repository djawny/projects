package zadanie4_przeslanianie_kolekcje_zbiory_listy_mapy_wyjatki;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        //LISTY
        List<String> list1 = new LinkedList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            list1.add("ABC");
        }
        long endTime = System.nanoTime();
        System.out.println("LinkedList: " + (endTime - startTime) / 1000000000d);

        List<String> list2 = new ArrayList<>();

        startTime = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            list2.add("ABC");
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList:" + (endTime - startTime) / 1000000000d);

        List<String> stingList = new ArrayList<>();
        boolean index = true;
        do {
            System.out.println("Chcesz dodac element do listy T/N: ");
            String str = new Scanner(System.in).nextLine();
            switch (str) {
                case "T":
                    System.out.println("Podaj tresc: ");
                    String element = new Scanner(System.in).nextLine();
                    stingList.add(element);
                    break;
                case "N":
                    index = false;
                    break;
                default:
                    System.out.println("Zla odpowiedz.");
                    break;
            }
        } while (index);
        System.out.println("Lista ma postac: ");
        for (String s : stingList) {
            System.out.println(s);
        }


        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            oddNumbers.add(i + 1);
        }
        for (int i = 0; i < oddNumbers.size(); i++) {
            if (oddNumbers.get(i) % 2 == 0) {
                oddNumbers.remove(i);
            }
        }
        System.out.println("Lista ma postac: ");
        for (Integer oddNumber : oddNumbers) {
            System.out.println(oddNumber);
        }
        System.out.println("Rozmiat listy to: " + oddNumbers.size());

    }
}
