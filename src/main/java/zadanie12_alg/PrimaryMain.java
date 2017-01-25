package zadanie12_alg;

import java.util.List;

public class PrimaryMain {
    public static void main(String[] args) {

//        boolean is10Primary = Primary.isPrimary(10);
//        System.out.println("Czy 10 jest liczbą pierwsza? " + is10Primary);
//
//        boolean is13Primary = Primary.isPrimary(13);
//        System.out.println("Czy 13 jest liczbą pierwsza? " + is13Primary);
//
//        long time = System.nanoTime();
//        List<Integer> primaryNumbers1 = Primary.getAllPrimaryNumbersTo(100000);
//        for (Integer primaryNumber : primaryNumbers1) {
//            System.out.println(primaryNumber);
//        }
//        System.out.println("Normal: "+(System.nanoTime() - time)/1000000000d);
//
//        time = System.nanoTime();
//        List<Integer> primaryNumbers2 = Primary.getAllPrimaryNumbersEratosthenes(100000);
//        for (Integer primaryNumber : primaryNumbers2) {
//            System.out.println(primaryNumber);
//        }
//        System.out.println("Eratosthenes: "+ (System.nanoTime() - time)/1000000000d);

        List<Integer> primaryFactors = Primary.primeFactors(12);
        for (Integer primaryNumber : primaryFactors) {
            System.out.println(primaryNumber);
        }

    }
}
