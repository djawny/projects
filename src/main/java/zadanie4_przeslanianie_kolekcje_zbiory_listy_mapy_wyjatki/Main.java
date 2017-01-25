package zadanie4_przeslanianie_kolekcje_zbiory_listy_mapy_wyjatki;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(100, 100);
        System.out.println(point1);

        Point point2 = new Point(100, 100);

        boolean areEquals = point1.equals(point2);
        System.out.println(areEquals);

        Client client1 = new Client("Jan", "Kowalski", 1980);
        Client client2 = new Client("Jan", "Kowalski", 1980);

        boolean areClientsEqual = client1.equals(client2);
        System.out.println("Czy klienci są równi: " + areClientsEqual);

        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());

        //ZBIORY
        Set set = new HashSet();
        set.add(1);
        set.add(1);
        set.add(2);

        System.out.println(set.size());

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);

    }
}
