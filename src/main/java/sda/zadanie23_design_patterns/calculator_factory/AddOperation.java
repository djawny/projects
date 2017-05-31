package sda.zadanie23_design_patterns.calculator_factory;

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
