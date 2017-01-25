package sda.zadanie14_przeslanianie_w_interfejsach;

public class Subtract implements Operation {
    @Override
    public Double eval(Double value1, Double value2) {
        return value1 - value2;
    }
}
