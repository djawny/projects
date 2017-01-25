package sda.zadanie21;

public class CSVMain {
    public static void main(String[] args) {
        Integer[][] data = new Integer[][]{{1, 2}, {3, 4, 5}, {6, 7}};
        CSV.saveArrayToCSV("test.csv", data);
        Integer[][] dataFromCSV = CSV.readArrayFromCSV("test.csv");
        for (int i = 0; i < dataFromCSV.length; i++) {
            for (int j = 0; j < dataFromCSV[i].length; j++) {
                System.out.print(dataFromCSV[i][j] + ",");
            }
            System.out.println();
        }
    }
}
