package com.biao.bridge;

class App {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstractionA();
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
