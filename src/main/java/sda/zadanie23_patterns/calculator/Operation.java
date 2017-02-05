package sda.zadanie23_patterns.calculator;

public interface Operation {
    double evaluate(double x, double y);

    String name();

    default boolean isNull() {
        return false;
    }
}
