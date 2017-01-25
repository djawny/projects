package zadanie15_watki;

public class MyThread implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Watek 1");
        }
    }
}
