package com.biao.bridge;

import com.biao.Logger;

class ConcreteImplementorB extends Implementor {
    @Override
    public void operation() {
        Logger.LOG("ConcreteImplementorB#operation");
    }
}
