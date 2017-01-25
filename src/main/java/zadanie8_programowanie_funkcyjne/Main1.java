package zadanie8_programowanie_funkcyjne;

import java.util.stream.IntStream;

public class Main1 {
    public static void main(String[] args) {


//        IntPredicate isDivisibleBy2 = number -> number % 2 == 0;
//        IntStream.range(0, 100).filter(isDivisibleBy2).forEach(System.out::println);

        IntStream.range(0, 100).filter(number -> number % 3 == 0 || number % 5 == 0).forEach(System.out::println);


    }
}
