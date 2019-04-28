package com.biao.adapter;

/**
 * 适配器
 */
class App {
    public static void main(String[] arg) {
        Driver driver = new Driver();
        driver.setCarAdapter(new CadillacAdapter(new Cadillac()));
        driver.drive();
        driver.setCarAdapter(new HondaAdapter(new Honda()));
        driver.drive();
    }
}
