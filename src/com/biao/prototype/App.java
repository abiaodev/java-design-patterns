package com.biao.prototype;

import com.biao.Logger;

/**
 * 原型模式
 */
class App {
    public static void main(String[] args) {
        ConcretePrototypeOne concretePrototypeOne = new ConcretePrototypeOne("abiao");
        ConcretePrototypeOne concretePrototypeOne1 = (ConcretePrototypeOne) concretePrototypeOne.getPrototype();
        Logger.LOG(concretePrototypeOne1.getName());
    }
}
