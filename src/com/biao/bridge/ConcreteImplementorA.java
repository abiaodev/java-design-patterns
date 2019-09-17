package com.biao.bridge;

import com.biao.Logger;

class ConcreteImplementorA extends Implementor {
    @Override
    public void operation() {
        Logger.LOG("ConcreteImplementorA#operation");
    }
}
