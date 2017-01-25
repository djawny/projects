package sda.zadanie12_alg;

import java.util.LinkedList;
import java.util.List;

public class Primary {
    public static boolean isPrimary(int x) {

        for (int i = 2; i < (x / 2 + 1); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static List<Integer> getAllPrimaryNumbersTo(int n) {
        List<Integer> listOfPrimaryNumbersToN = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrimary(i)) listOfPrimaryNumbersToN.add(i);
        }
        return listOfPrimaryNumbersToN;
    }

    public static List<Integer> getAllPrimaryNumbersEratosthenes(int n) {
        List<Integer> listOfPrimaryNumbersToN = new LinkedList<>();
        int[] tableOfAllIntsToN = new int[n + 1];
        for (int i = 2; i < n + 1; i++) {
            tableOfAllIntsToN[i] = i;
        }

        for (int i = 2; i < tableOfAllIntsToN.length / 2 + 1; i++) {
            if (tableOfAllIntsToN[i] != -1) {
                for (int j = i + i; j < tableOfAllIntsToN.length; j += i) {
                    tableOfAllIntsToN[j] = -1;
                }
            }
        }
        for (int i = 2; i < tableOfAllIntsToN.length; i++) {
            if (tableOfAllIntsToN[i] != -1) listOfPrimaryNumbersToN.add(tableOfAllIntsToN[i]);
        }

        return listOfPrimaryNumbersToN;
    }

    public static List<Integer> primeFactors(int x) {
        List<Integer> listOfPrimeFactors = new LinkedList<>();
        List<Integer> listOfPrimesForX = Primary.getAllPrimaryNumbersEratosthenes(x);

        while (x != 1) {
            for (int i = 0; i <listOfPrimesForX.size(); i++) {
                if (x % listOfPrimesForX.get(i) == 0) {
                    listOfPrimeFactors.add(listOfPrimesForX.get(i));
                    x = x / listOfPrimesForX.get(i);
                    break;
                }
            }
        }
        return listOfPrimeFactors;
    }
}
