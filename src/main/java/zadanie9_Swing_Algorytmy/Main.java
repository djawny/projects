package zadanie9_Swing_Algorytmy;

public class Main {
    public static void main(String[] args) {
        new MyWindow();
//        System.out.println(silnia(4));

    }

    public static int silnia(int x) {
        if (x == 1) {
            return 1;
        } else return x * silnia(x - 1);
    }
}
