package sda.zadanie23_design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    protected void notifyAboutChange() {
        observerList.forEach(x -> x.updated());
    }
}
