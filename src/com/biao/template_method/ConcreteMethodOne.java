package com.biao.template_method;

class ConcreteMethodOne extends BaseMethod{
    @Override
    protected String stepOne() {
        return "ConcreteMethodOne stepOne";
    }

    @Override
    protected String stepTwo() {
        return "ConcreteMethodOne stepTwo";
    }
}
