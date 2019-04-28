package com.biao.observer;

import com.biao.Logger;

public class ConcreteObserverTwo implements Observer {
    private String state;

    @Override
    public void upDate(String state) {
        this.state = state;
        Logger.LOG("ConcretePeopleTwo upDate:" + state);
    }
}
