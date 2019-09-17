package com.biao.observer;

import com.biao.observer.generic.*;
import com.biao.observer.generic.ConcretePeopleOne;
import com.biao.observer.generic.ConcretePeopleTwo;

/**
 * 观察者模式
 */
class App {
    public static void main(String[] arg) {
        People observer1 = new ConcretePeopleOne();
        People observer2 = new ConcretePeopleTwo();
        Weather weather = new Weather();
        weather.addObserver(observer1);
        weather.addObserver(observer2);
        WeatherType weatherType = new WeatherType();
        weatherType.setType("暴风雨");
        weather.changeWeather(weatherType);
        weatherType.setType("风雨");
        weather.changeWeather(weatherType);
    }
}
