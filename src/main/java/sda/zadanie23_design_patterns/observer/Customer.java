package sda.zadanie23_design_patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Customer implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Customer has been notified about change");
    }
}