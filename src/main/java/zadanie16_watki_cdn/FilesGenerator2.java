package zadanie16_watki_cdn;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FilesGenerator2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<List<String>> future1 = executorService.submit(new FilesGeneratorCallable(0, 100));
        Future<List<String>> future2 = executorService.submit(new FilesGeneratorCallable(100, 200));
        List<String> strings1 = future1.get();
        List<String> strings2 = future2.get();
        for (String string : strings1) {
            System.out.println(string);
        }
        for (String string : strings2) {
            System.out.println(string);
        }
        executorService.shutdown();
    }
}
