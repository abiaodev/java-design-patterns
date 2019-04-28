package com.biao.adapter;

class HondaAdapter implements CarAdapter {
    private Honda honda;

    public HondaAdapter(Honda honda) {
        this.honda = honda;
    }

    @Override
    public void drive() {
        honda.run();
    }
}
