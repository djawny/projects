package zadanie14_przeslanianie_w_interfejsach;

public class Divide implements Operation {
    @Override
    public Double eval(Double value1, Double value2) {
        return value1/value2;
    }
}
