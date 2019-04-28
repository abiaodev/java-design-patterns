package com.biao.abstract_factory;

class ConcreteFactoryB implements IFactory {
    @Override
    public IMethodOne createMethodOne() {
        return new MethodOneB();
    }

    @Override
    public IMethodTwo createMethodTwo() {
        return new MethodTwoB();
    }
}
