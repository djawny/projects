package sda.zadanie23_design_patterns.calculator_factory;

public class NullOperation implements Operation {
    @Override
    public double evaluate(double x, double y) {
        return 0;
    }

    @Override
    public String name() {
        return "Do nothing";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
