package com.biao.template_method;

class MethodRunImp {
    private BaseMethod baseMethod;

    public MethodRunImp(BaseMethod baseMethod) {
        this.baseMethod = baseMethod;
    }

    public void changeMethod(BaseMethod baseMethod) {
        this.baseMethod = baseMethod;
    }

    public void run() {
        baseMethod.runMethod();
    }
}
