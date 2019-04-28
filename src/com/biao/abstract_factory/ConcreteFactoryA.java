package com.biao.abstract_factory;

class ConcreteFactoryA implements IFactory {
    @Override
    public IMethodOne createMethodOne() {
        return new MethodOneA();
    }

    @Override
    public IMethodTwo createMethodTwo() {
        return new MethodTwoA();
    }
}
