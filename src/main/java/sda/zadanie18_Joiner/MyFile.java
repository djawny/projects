package sda.zadanie18_Joiner;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFile {
    public static String readMessageFromFile(String filePath) {
        List<String> read = new ArrayList<String>();
        File file = new File(filePath);
        try {
            read = Files.readLines(file, Charsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Brak pliku");
        }
        return Joiner.on(System.lineSeparator()).join(read);
    }
}
