package sda.zadanie23_patterns.calculator;

public class AddOperation implements Operation {

    @Override
    public double evaluate(double x, double y) {
        return x + y;
    }

    @Override
    public String name() {
        return "Dodawanie";
    }
}
