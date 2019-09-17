package com.biao.template_method;

import com.biao.Logger;

abstract class BaseMethod {
    protected abstract String stepOne();

    protected abstract String stepTwo();

    public void runMethod() {
        Logger.LOG("stepOne:" + stepOne());
        Logger.LOG("stepTwo:" + stepTwo());

    }
}
