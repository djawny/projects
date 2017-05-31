package sda.zadanie23_design_patterns.observer;

public class BankAccount extends Observable {
    public void changeBalance(int x) {
        System.out.println("Changing balance");
        notifyObservers();
    }

    private void notifyObservers() {
        notifyAboutChange();
    }
}
