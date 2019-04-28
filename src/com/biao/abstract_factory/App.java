package com.biao.abstract_factory;

/**
 * 抽象工厂
 */
class App {
    public static void main(String[] arg) {
        IFactory factory = new ConcreteFactoryA();
        factory.createMethodOne().runMethod();
        factory.createMethodTwo().runMethod();
        factory = new ConcreteFactoryB();
        factory.createMethodOne().runMethod();
        factory.createMethodTwo().runMethod();
    }
}
