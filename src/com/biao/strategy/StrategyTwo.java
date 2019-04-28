package com.biao.strategy;

import com.biao.Logger;

class StrategyTwo implements Strategy {
    @Override
    public void execute(String name) {
        Logger.LOG("StrategyTwo:" + name);
    }
}
