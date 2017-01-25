package zadanie15_watki;

public class Threading {
    public static void main(String[] args) {
        Runnable runnable1 = new MyThread();
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Watek 2");
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new MyThread2();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
