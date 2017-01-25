package sda.zadanie15_watki;

public class IntTableRunnable implements Runnable {
    private int[] ints;
    private int startIndex;
    private int endIndex;
    private int intsMin;

    IntTableRunnable(int[] ints, int startIndex, int endIndex) {
        this.ints = ints;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    int getIntsMin() {
        return intsMin;
    }

    @Override
    public void run() {
        intsMin = ints[startIndex];
        for (int i = startIndex; i < endIndex; i++) {
            if (intsMin > ints[i]) intsMin = ints[i];
        }
    }
}
