package sda.zadanie10_alg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataFileReader {
    public static int[] readFileAsArray(String path) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(path));
        List<Integer> dataList = new ArrayList<>();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            Integer integer = Integer.parseInt(line);
            dataList.add(integer);
        }

        int[] dataArray = new int[dataList.size()];
        for (int i = 0; i < dataList.size(); i++) {
            dataArray[i] = dataList.get(i);
        }

        return dataArray;
    }

    public static String readFileAsString(String path) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(path));
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
            stringBuilder.append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }
}
