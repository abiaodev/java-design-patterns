package com.biao.abstract_factory;

import com.biao.Logger;

class MethodOneB implements IMethodOne{
    @Override
    public void runMethod() {
        Logger.LOG("MethodOneB is run");
    }
}
