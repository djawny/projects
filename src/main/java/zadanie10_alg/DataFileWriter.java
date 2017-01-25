package zadanie10_alg;

import java.io.FileWriter;
import java.io.IOException;


public class DataFileWriter {
    public static void saveStringToFile(String text, String path) throws IOException {

        FileWriter fileWriter = new FileWriter(path);

        fileWriter.write(text);
        fileWriter.flush();
        fileWriter.close();
    }
}
