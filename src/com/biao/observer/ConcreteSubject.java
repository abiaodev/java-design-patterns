package com.biao.observer;

class ConcreteSubject extends Subject {
    private String state;

    public void changeState(String state) {
        this.state = state;
        notifyChange(state);
    }
}
