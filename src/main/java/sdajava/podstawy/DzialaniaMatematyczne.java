package sdajava.podstawy;

//import java.util.Scanner;

public class DzialaniaMatematyczne {

    public static void main(String[] args) {

        double kwotaWZlotych = 1000;
        double kworaWEuro= kwotaWZlotych/4.3;
        System.out.println("Kwota w Zlotych: " + kwotaWZlotych);
        System.out.println("Kwota w Euro: " + kworaWEuro);

        double a = 4, b = 7;
        double y = a * a + 2 * a * b + b * b;
        System.out.println("y= " + y);

        double x1 = 4, y1 = 5, x2 = 8, y2 = 1;
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("d= " + d);

        double l = 15, r = 10;
        double vk = 1d / 6d * Math.PI * Math.pow(l, 6) / ((Math.pow(l, 2) - Math.pow(r, 2)) * Math.sqrt(Math.pow(l, 2) - Math.pow(r, 2)));
        System.out.println("Objetosc kuli opisanej na stozku wynosi vk= " + vk);


        /*double x = new Scanner(System.in).nextDouble();
        if (x % 2 == 0) System.out.println("Liczba parzysta");
        else System.out.println("Liczba nieparzysta");

        System.out.println("Podaj bok a trojkata:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Podaj bok b trojkata:");
        double b = new Scanner(System.in).nextDouble();
        double c = Math.sqrt(a * a + b * b);
        if (a <= 0 || b <= 0) {
            System.out.println("Bledne dane.");
        } else {
            System.out.println("Bok c trojkata = " + c);
        }*/

    }
}
