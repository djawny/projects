package zadanie17_java8;

import zadanie13_sortowanie_kolekcji_klasa_anonimowa_swing.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> integersList = new ArrayList<>();
        integersList.add(1);
        integersList.add(16);
        integersList.add(6);
        integersList.add(11);
        integersList.add(2);
        integersList.add(8);


//        integersList.stream().filter(x -> x < 10).forEach(x -> System.out.println(x));
//        integersList.stream().map(x -> x * x).forEach(x -> System.out.println(x));
//        boolean anyMatch = integersList.stream().anyMatch(x -> x == 8);
//        integersList.stream().filter(x -> x < 10).forEach(System.out::println);
//        integersList.forEach(x -> System.out.println(x));
//        List<Integer> collect1 = integersList.stream().map(x -> x * x).collect(Collectors.toList());
//        IntStream.range(0, 100).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
//        List<Integer> collect = IntStream.range(0, 100).filter(x -> x % 2 == 0).boxed().collect(Collectors.toList());
//        int sum = IntStream.range(0, 100).sum();
//        System.out.println(sum);
//        final int[] sums = {0};
//        integersList.forEach(x -> sums[0] += x);
//        System.out.println(sums[0]);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jan", "Kowalski", 1980));
        personList.add(new Person("Piotr", "Mickiewicz", 1960));
        personList.add(new Person("Adam", "Mickiewicz", 1960));
        personList.add(new Person("Łukasz", "Mickiewicz", 1960));
        personList.add(new Person("Adam", "Adamski", 1970));

//        personList.stream().filter(x -> x.getBirthYear() < 1970).forEach(x -> System.out.println(x));

        List<String> firstAndLastNamesList = personList.stream().map(x -> x.getFirstName() + " " + x.getLastName()).
                collect(Collectors.toList());
//        firstAndLastNamesList.forEach(System.out::println);

        Set<String> lastNamesSet = personList.stream().map(Person::getLastName).collect(Collectors.toSet());
//        lastNamesSet.forEach(System.out::println);

        // summaryStatistics
        List<Integer> birthYears = personList.stream().map(x -> x.getBirthYear()).collect(Collectors.toList());
        IntSummaryStatistics summaryStatistics = personList.stream().mapToInt(x -> x.getBirthYear()).summaryStatistics();
        double average = summaryStatistics.getAverage();
        int min = summaryStatistics.getMin();
        int max = summaryStatistics.getMax();
        long count = summaryStatistics.getCount();
        long sum1 = summaryStatistics.getSum();

        // partitioningBy
        Map<Boolean, List<Person>> collect2 = personList.stream().
                collect(Collectors.partitioningBy(x -> x.getBirthYear() < 1970));
//        System.out.println("Dla wartości TRUE");
//        collect2.get(true).forEach(System.out::println);
//        System.out.println("Dla wartości FALSE");
//        collect2.get(false).forEach(System.out::println);

        Map<Boolean, List<Person>> firstNamesMap = personList.stream().
                collect(Collectors.partitioningBy(x -> x.getFirstName().startsWith("A")));
//        System.out.println("Dla wartości TRUE");
//        firstNamesMap.get(true).forEach(System.out::println);
//        System.out.println("Dla wartości FALSE");
//        firstNamesMap.get(false).forEach(System.out::println);

        // groupingBy
        Map<String, List<Person>> lastNamesMap = personList.stream().collect(Collectors.groupingBy(x -> x.getLastName()));
//        lastNamesMap.get("Mickiewicz").forEach(System.out::println);

        // joining
        String joined = personList.stream().map(Person::getFirstName).
                collect(Collectors.joining(";", "Imiona: ", " Koniec"));
        System.out.println(joined);
    }

    public static boolean isPrimaryStream(int x) {
        return IntStream.range(2, x / 2).noneMatch(y -> x % y == 0);
    }

    public static List<Integer> getListOfAllPrimaryNumbersLessThan(int x) {
        return IntStream.range(2, x - 1).filter(Streams::isPrimaryStream).boxed().collect(Collectors.toList());
    }

    public static IntStream getIntStreamOfAllPrimaryNumbersLessThan(int x) {
        return IntStream.range(2, x - 1).filter(Streams::isPrimaryStream);
    }

    public static IntSummaryStatistics getSummaryStatisticsOfAllPrimaryNumbersLessThan(int x) {
        return IntStream.range(2, x - 1).filter(Streams::isPrimaryStream).summaryStatistics();
    }
}
