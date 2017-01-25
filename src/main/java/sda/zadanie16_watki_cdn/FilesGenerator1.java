package sda.zadanie16_watki_cdn;

public class FilesGenerator1 {
    public static void main(String[] args) throws InterruptedException {
        FilesGeneratorRunnable runnable1 = new FilesGeneratorRunnable(0, 500);
        FilesGeneratorRunnable runnable2 = new FilesGeneratorRunnable(500, 1000);
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        for (String path : runnable1.getFilesPathList()) {
            System.out.println(path);
        }
        for (String path : runnable2.getFilesPathList()) {
            System.out.println(path);
        }
    }
}
