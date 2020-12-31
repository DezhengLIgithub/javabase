package com.para.javabase.observer;

import java.util.Vector;

public class Subject {

    private Vector<Observer> observers = new Vector<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }


    public void notifyObserver() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }


}
