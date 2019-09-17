package com.biao.decorator;

import com.biao.Logger;

class DecoratorTwo extends Decorator {
    @Override
    public void operation(String name) {
        super.operation(name);
        newOperation(name);
    }
    private void newOperation(String name) {
        Logger.LOG("DecoratorTwo#newOperation:" + name);
    }
}
