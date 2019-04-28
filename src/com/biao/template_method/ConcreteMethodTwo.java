package com.biao.template_method;

class ConcreteMethodTwo extends BaseMethod{
    @Override
    protected String stepOne() {
        return "ConcreteMethodTwo stepOne";
    }

    @Override
    protected String stepTwo() {
        return "ConcreteMethodTwo stepTwo";
    }
}
