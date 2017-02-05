package sda.zadanie23_design_patterns.calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        String operation = "+";
        int x = 0;
        int y = 1;

        Operation operationObject = OperationFactory.create(operation);

        if (!operationObject.isNull()) {
            System.out.println("Wykonuję operację " + operationObject.name());
            double result = operationObject.evaluate(x, y);
            System.out.println("Wynik to: " + result);
        }
    }
}
