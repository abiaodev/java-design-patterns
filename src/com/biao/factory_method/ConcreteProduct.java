package com.biao.factory_method;

import com.biao.Logger;

class ConcreteProduct implements Product {
    @Override
    public void desc() {
        Logger.LOG("ConcreteProduct#desc");
    }
}
