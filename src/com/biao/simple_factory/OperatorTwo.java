package com.biao.simple_factory;

import com.biao.Logger;

class OperatorTwo implements Operator {

    @Override
    public void runOperator(String name) {
        Logger.LOG("OperatorTwo:" + name);
    }
}
