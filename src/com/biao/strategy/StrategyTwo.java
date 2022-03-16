package com.biao.strategy;

import com.biao.Logger;
import com.sun.javafx.css.CalculatedValue;
import com.sun.org.apache.xpath.internal.operations.Operation;

class StrategyTwo implements Strategy {
    @Override
    public void execute(String name) {
        Logger.LOG("StrategyTwo:" + name);
    }
    private String name;
}
