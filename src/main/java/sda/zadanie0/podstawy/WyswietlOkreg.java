package sda.zadanie0.podstawy;

public class WyswietlOkreg {
    public static void main(String[] args) {

        int promienOkregu = 23;
        double dokladnosc = 0.5;

        int i = 0, j;
        while (i < promienOkregu) {
            j = 0;
            while (j < promienOkregu) {
                double odlegloscOdSrodkaOkregu = Math.sqrt(Math.pow(i - promienOkregu / 2, 2) + Math.pow(j - promienOkregu / 2, 2));

                if (odlegloscOdSrodkaOkregu > (promienOkregu / 2 - dokladnosc) && odlegloscOdSrodkaOkregu < (promienOkregu / 2 + dokladnosc)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
