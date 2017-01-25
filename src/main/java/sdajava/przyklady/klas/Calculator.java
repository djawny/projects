package sdajava.przyklady.klas;

import zadanie14_przeslanianie_w_interfejsach.*;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę x: ");
        Double x = new Scanner(System.in).nextDouble();
        System.out.println("Podaj liczbę y: ");
        Double y = new Scanner(System.in).nextDouble();
        System.out.println("Jakie chcesz wykonać działanie? (-, +, *, /):");
        String operationChar = new Scanner(System.in).nextLine();

        Operation operationToPerform = null;
        switch (operationChar) {
            case "+":
                operationToPerform = new Add();
                break;
            case "-":
                operationToPerform = new Subtract();
                break;
            case "*":
                operationToPerform = new Multiply();
                break;
            case "/":
                operationToPerform = new Divide();
                break;
            default:
                throw new IllegalArgumentException("Zly kod dzialania");
        }
        Double result = operationToPerform.eval(x, y);
        System.out.println("Wynik dzialania to: " + result);
    }
}
