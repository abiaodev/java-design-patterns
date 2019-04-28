package com.biao.observer;

public class ConcreteSubject extends Subject {
    private String state;

    public void changeState(String state) {
        this.state = state;
        notifyChange(state);
    }
}
