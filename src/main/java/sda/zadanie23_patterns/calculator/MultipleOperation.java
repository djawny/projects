package sda.zadanie23_patterns.calculator;

public class MultipleOperation implements Operation {

    @Override
    public double evaluate(double x, double y) {
        return x * y;
    }

    @Override
    public String name() {
        return "Mnożenie";
    }
}
