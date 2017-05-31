package sda.zadanie23_design_patterns.observer;

public class Customer implements Observer {

    @Override
    public void updated() {
        System.out.println("Customer has been notified about change");

    }
}
