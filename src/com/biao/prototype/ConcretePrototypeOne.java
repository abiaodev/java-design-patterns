package com.biao.prototype;

class ConcretePrototypeOne extends Prototype{
    public ConcretePrototypeOne(String name) {
        super(name);
    }

    @Override
    public Prototype getPrototype() {
        return this;
    }
}
