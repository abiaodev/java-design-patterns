package com.biao.observer.generic;

import com.biao.Logger;

class ConcretePeopleTwo extends People {
    @Override
    public void upDate(WeatherType weatherType) {
        Logger.LOG("ConcretePeopleTwo:" + weatherType.getType());
    }
}
