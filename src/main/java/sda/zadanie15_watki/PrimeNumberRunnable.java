package sda.zadanie15_watki;

public class PrimeNumberRunnable implements Runnable {
    private boolean isPrimary;
    private int start;
    private int end;
    private int x;

    PrimeNumberRunnable(int start, int end, int x) {
        this.start = start;
        this.end = end;
        this.x = x;
    }

    boolean isPrime() {
        return isPrimary;
    }

    @Override
    public void run() {
        isPrimary = true;
        for (int i = start; i < end; i++) {
            if (x % i == 0) {
                isPrimary = false;
            }
        }
    }
}
