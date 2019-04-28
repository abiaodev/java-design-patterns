package com.biao.prototype;

abstract class Prototype implements Cloneable{
    private String name;

    public Prototype(String name) {
        this.name = name;
    }
    public abstract Prototype getPrototype();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
