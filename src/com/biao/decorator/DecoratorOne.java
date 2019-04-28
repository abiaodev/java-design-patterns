package com.biao.decorator;

import com.biao.Logger;

class DecoratorOne extends Decorator {
    @Override
    public void operation(String name) {
        Logger.LOG("DecoratorOne:" + name);
    }
}
