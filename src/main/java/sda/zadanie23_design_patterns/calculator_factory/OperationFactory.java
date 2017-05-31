package sda.zadanie23_design_patterns.calculator_factory;

public class OperationFactory {
    public static Operation create(String operation) {
        switch (operation) {
            case "+":
                return new AddOperation();
            case "-":
                return new SubtractOperation();
        }
        return new NullOperation();
    }
}
