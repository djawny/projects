package zadanie8_programowanie_funkcyjne;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Optional<String> someValue = Optional.empty();
        someValue.ifPresent(System.out::println);

        Optional<String> someValue1 = Optional.of("Hello world");
        someValue1.ifPresent(System.out::println);

        Consumer<String> println = System.out::println;
        Predicate<String> stringPredicate = v -> v.length() > 20;
        someValue1.filter(stringPredicate).ifPresent(println);
        someValue1.orElse("Goodbye");



        Optional<Integer> a = Optional.empty();
        Optional<Integer> b = Optional.empty();
        a = Optional.of(8);
        b = Optional.of(2);

        System.out.println(divide(a, b).orElse(-1d));
    }

    private static Optional<Double> divide(Optional<Integer> a, Optional<Integer> b) {
        Optional.ofNullable(null);
        if (b.filter(value -> value != 0).isPresent() && a.isPresent())
            return Optional.of(Double.valueOf(a.get() / b.get()));
        return Optional.empty();
    }


}