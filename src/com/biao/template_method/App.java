package com.biao.template_method;

/**
 * 模板方法
 */
class App {
    public static void main(String[] args) {
        MethodRunImp methodRunImp = new MethodRunImp(new ConcreteMethodOne());
        methodRunImp.run();
        methodRunImp.changeMethod(new ConcreteMethodTwo());
        methodRunImp.run();

    }

}
