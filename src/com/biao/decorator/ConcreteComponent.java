package com.biao.decorator;

import com.biao.Logger;

class ConcreteComponent implements Component {

    @Override
    public void operation(String name) {
        Logger.LOG("ConcreteComponent#operation:" + name);
    }
}
