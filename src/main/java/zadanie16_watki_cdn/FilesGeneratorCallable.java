package zadanie16_watki_cdn;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class FilesGeneratorCallable implements Callable<List<String>> {
    private int start;
    private int end;

    public FilesGeneratorCallable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public List<String> call() throws Exception {
        List<String> filesPathList = new ArrayList<>();
        for (int i = start; i < end; i++) {
            String filePath = "test/file" + i + ".txt";
            File file = new File(filePath);
            try {
                Files.write("1", file, Charsets.UTF_8);
                filesPathList.add(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return filesPathList;
    }
}
