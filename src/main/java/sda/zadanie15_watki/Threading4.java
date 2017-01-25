package sda.zadanie15_watki;

import java.util.ArrayList;
import java.util.List;

public class Threading4 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> integerList = new ArrayList<>();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    synchronized (integerList) {
                        integerList.add(i);
                    }
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(runnable);
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println(integerList.size());
    }
}
