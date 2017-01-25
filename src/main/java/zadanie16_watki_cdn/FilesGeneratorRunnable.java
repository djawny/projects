package zadanie16_watki_cdn;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilesGeneratorRunnable implements Runnable {
    private int start;
    private int end;
    private List<String> filesPathList;

    FilesGeneratorRunnable(int start, int end) {
        filesPathList = new ArrayList<>();
        this.start = start;
        this.end = end;
    }

    List<String> getFilesPathList() {
        return filesPathList;
    }

    @Override
    public void run() {
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

    }
}
