package sda.zadanie23_design_patterns.calculator;

public class SubtractOperation implements Operation {

    @Override
    public double evaluate(double x, double y) {
        return x - y;
    }

    @Override
    public String name() {
        return "Odejmowanie";
    }
}
