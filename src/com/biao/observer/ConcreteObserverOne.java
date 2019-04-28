package com.biao.observer;

import com.biao.Logger;

import java.util.Arrays;
import java.util.Collections;

public class ConcreteObserverOne implements Observer {
    private String state;

    @Override
    public void upDate(String state) {
        this.state = state;
        Logger.LOG("ConcretePeopleOne upDate:" + state);
    }
}
