package com.biao.factory_method;

import com.biao.Logger;

public class ConcreteProduct implements Product {
    @Override
    public void desc() {
        Logger.LOG("ConcreteProduct#desc");
    }
}
