package com.biao.abstract_factory;

import com.biao.Logger;

class MethodTwoB implements IMethodTwo {
    @Override
    public void runMethod() {
        Logger.LOG("MethodTwoB is run");
    }
}
