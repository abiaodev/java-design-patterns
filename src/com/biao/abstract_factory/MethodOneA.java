package com.biao.abstract_factory;

import com.biao.Logger;

class MethodOneA implements IMethodOne{
    @Override
    public void runMethod() {
        Logger.LOG("MethodOneA is run");
    }
}
