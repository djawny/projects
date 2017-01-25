package zadanie15_watki;

public class PrimeNumber {

    private static boolean isPrimeNumber(int x) {
        for (int i = 2; i < (x / 2 + 1); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeNumber2Threads(int x) throws InterruptedException {
        PrimeNumberRunnable primeNumberRunnable1 = new PrimeNumberRunnable(2, x / 4, x);
        PrimeNumberRunnable primeNumberRunnable2 = new PrimeNumberRunnable(x / 4, x / 2 + 1, x);
        Thread thread1 = new Thread(primeNumberRunnable1);
        Thread thread2 = new Thread(primeNumberRunnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        return primeNumberRunnable1.isPrime() && primeNumberRunnable2.isPrime();
    }

    public static void main(String[] args) throws InterruptedException {
        long start, end;
        double duration;
        boolean isPrimary;
        int x = 118297;

        start = System.nanoTime();
        isPrimary = isPrimeNumber(x);
        end = System.nanoTime();
        System.out.println("Czy " + x + " jest liczbą pierwsza? " + (isPrimary ? "Tak" : "Nie"));
        duration = (end - start) / 1000000000d;
        System.out.println("Duration: " + duration);

        start = System.nanoTime();
        isPrimary = isPrimeNumber2Threads(x);
        end = System.nanoTime();
        System.out.println("Czy " + x + " jest liczbą pierwsza? " + (isPrimary ? "Tak" : "Nie"));
        duration = (end - start) / 1000000000d;
        System.out.println("Duration: " + duration);
    }
}
