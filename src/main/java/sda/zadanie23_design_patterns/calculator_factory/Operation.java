package sda.zadanie23_design_patterns.calculator_factory;

public interface Operation {
    double evaluate(double x, double y);

    String name();

    default boolean isNull() {
        return false;
    }
}
