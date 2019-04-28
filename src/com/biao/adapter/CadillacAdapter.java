package com.biao.adapter;

class CadillacAdapter implements CarAdapter {
    Cadillac cadillac;

    public CadillacAdapter(Cadillac cadillac) {
        this.cadillac = cadillac;
    }

    @Override
    public void drive() {
        cadillac.run();
    }
}
