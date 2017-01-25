package sda.zadanie19_csv_mail;


import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSV {
    public static Integer[][] readArrayFromCSV(String filePath) {
        List<String> readLines = new ArrayList<>();
        File file = new File(filePath);
        try {
            readLines = Files.readLines(file, Charsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Brak pliku");
        }
        Integer[][] data = new Integer[readLines.size()][];
        int i = 0;
        for (String readLine : readLines) {
            List<String> splitLine = Splitter.on(",").splitToList(readLine);
            String[] dataSet = new String[splitLine.size()];
            dataSet = splitLine.toArray(dataSet);
            data[i] = new Integer[dataSet.length];
            for (int j = 0; j < dataSet.length; j++) {
                data[i][j] = Integer.parseInt(dataSet[j]);
            }
            i++;
        }
        return data;
    }

    public static void saveArrayToCSV(String filePath, Integer[][] data) {
        List<String> lines = new ArrayList<>();
        for (Integer[] datum : data) {
            String string = Joiner.on(",").join(datum);
            lines.add(string);
        }
        File file = new File(filePath);
        try {
            for (String line : lines) {
                Files.append(line + System.lineSeparator(), file, Charsets.UTF_8);
            }
        } catch (IOException e) {
            System.out.println("Nie moge zapisac pliku");
        }
    }
}
