package com.biao.abstract_factory;

import com.biao.Logger;

class MethodTwoA implements IMethodTwo{
    @Override
    public void runMethod() {
        Logger.LOG("MethodTwoA is run");
    }
}
