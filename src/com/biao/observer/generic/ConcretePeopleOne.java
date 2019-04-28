package com.biao.observer.generic;

import com.biao.Logger;

public class ConcretePeopleOne extends People {
    @Override
    public void upDate(WeatherType weatherType) {
        Logger.LOG("ConcretePeopleOne:" + weatherType.getType());
    }
}
