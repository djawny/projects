package zadanie15_watki;


import java.util.Random;

public class IntTable {

    private int[] ints;
    private int size;

    private IntTable(int size) {
        this.size = size;
        ints = new int[size];
        Random rand = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = rand.nextInt(10000);
        }
    }

    private void showIntTable() {
        for (int integer : ints) {
            System.out.println(integer);
        }
    }

    private int findIntTableMin() {
        int intsMin = ints[0];
        for (int integer : ints) {
            if (intsMin > integer) intsMin = integer;
        }
        return intsMin;
    }

    private int findIntTableMin4Threads() throws InterruptedException {
        IntTableRunnable intTableRunnable1 = new IntTableRunnable(ints, 0, size / 4);
        IntTableRunnable intTableRunnable2 = new IntTableRunnable(ints, size / 4, size / 2);
        IntTableRunnable intTableRunnable3 = new IntTableRunnable(ints, size / 2, 3 * size / 4);
        IntTableRunnable intTableRunnable4 = new IntTableRunnable(ints, 3 * size / 4, size / 4);
        Thread thread1 = new Thread(intTableRunnable1);
        Thread thread2 = new Thread(intTableRunnable2);
        Thread thread3 = new Thread(intTableRunnable3);
        Thread thread4 = new Thread(intTableRunnable4);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        int[] minimums = new int[4];
        minimums[0] = intTableRunnable1.getIntsMin();
        minimums[1] = intTableRunnable2.getIntsMin();
        minimums[2] = intTableRunnable3.getIntsMin();
        minimums[3] = intTableRunnable4.getIntsMin();
        int min = minimums[0];
        for (int i = 1; i < 4; i++) {
            if (min > minimums[i]) {
                min = minimums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) throws InterruptedException {
        long start, end;
        double duration;
        int min;
        IntTable intTable = new IntTable(100_000_000);

//        intTable.showIntTable();
        start = System.nanoTime();
        min = intTable.findIntTableMin();
        end = System.nanoTime();
        duration = (end - start) / 1_000_000_000d;
        System.out.println("Minimalna wartosc tablicy intow to: " + min);
        System.out.println("Duration: " + duration);

        start = System.nanoTime();
        min = intTable.findIntTableMin4Threads();
        end = System.nanoTime();
        duration = (end - start) / 1_000_000_000d;
        System.out.println("Minimalna wartosc tablicy intow to: " + min);
        System.out.println("Duration: " + duration);
    }
}
