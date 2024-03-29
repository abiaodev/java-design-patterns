package com.biao.decorator;

import com.biao.Logger;

class DecoratorOne extends Decorator {
    @Override
    public void operation(String name) {
        super.operation(name);
        newOperation(name);
    }

    private void newOperation(String name) {
        Logger.LOG("DecoratorOne#newOperation:" + name);
    }
}
