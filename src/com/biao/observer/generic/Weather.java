package com.biao.observer.generic;

class Weather extends Observable<WeatherType, People> {
    public void changeWeather(WeatherType weatherType) {
        notifyWeather(weatherType);
    }
}
