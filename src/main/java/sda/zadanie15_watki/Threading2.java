package sda.zadanie15_watki;

public class Threading2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                char[] c = {'-', '\\', '|', '/'};
                int i = 0;
                while (true) {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        break;
                    }
                    for (int j = 0; j < 50; j++) {
                        System.out.println();
                    }
                    System.out.println(c[i % 4]);
                    i++;
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        long sum = sum(10_000_000_000l);
        System.out.println("\nSuma: " + sum);
        thread.interrupt();
    }

    public static long sum(long x) {
        long sum = 0;
        for (long i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }
}
