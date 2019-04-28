package com.biao.observer.generic;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

abstract class Observable<A, O extends Observer<A>> {
    private List<O> observers;

    public Observable() {
        observers = new CopyOnWriteArrayList<>();
    }

    public void addObserver(O observer) {
        observers.add(observer);
    }

    public void removeObserver(O observer) {
        observers.remove(observer);
    }

    protected void notifyWeather(A a) {
        for (O observer : observers) {
            observer.upDate(a);
        }
    }
}
