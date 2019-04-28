package com.biao.strategy;

import com.biao.Logger;

class StrategyOne implements Strategy{

    @Override
    public void execute(String name) {
        Logger.LOG("StrategyOne:"+name);
    }
}
