package com.biao.observer;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyChange(String state) {
        for (Observer observer : observers) {
            observer.upDate(state);
        }
    }
}
