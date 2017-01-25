package sda.zadanie0.podstawy;

public class FillContainer {
    public static void main(String[] args) {

        String str = "PMMMLPML";
        System.out.println(str);

        Integer[] container = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int position = 0;
        boolean pickedBlock = false;
        int numberOfBlocks = 0;

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'P') {
                numberOfBlocks++;
                servicePick(numberOfBlocks);
                pickedBlock = true;
            } else if (str.charAt(i) == 'M' && pickedBlock) {
                serviceMove(numberOfBlocks);
                position++;
            } else if (str.charAt(i) == 'L' && pickedBlock) {
                serviceLower(container, position, numberOfBlocks);
                position = 0;
                pickedBlock = false;
            }
        displayContainer(container);
    }

    private static void displayContainer(Integer[] container) {
        System.out.print("Container: ");
        for (int i = 0; i < 9; i++) {
            System.out.print(" " + container[i]);
        }
    }

    public static void serviceMove(int num) {

        System.out.println("Move block " + num);
    }

    public static void servicePick(int num) {
        System.out.println("Pick block " + num);

    }

    public static void serviceLower(Integer[] container, int pos, int num) {
        container[pos]++;
        System.out.println("Lower block " + num);
    }
}

