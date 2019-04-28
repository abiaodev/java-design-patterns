package com.biao.adapter;

class Driver {
    private CarAdapter carAdapter;
    public void setCarAdapter(CarAdapter adapter){
        this.carAdapter = adapter;
    }

    public void drive() {
        carAdapter.drive();
    }
}
