package com.biao.decorator;

/**
 * 装饰模式
 * 当系统需要新功能时，是向旧的类中添加新代码。这些新加的代码通常装饰了原有类的核心职责或主要行为。
 *
 */
class App {
    public static void main(String[] arg) {
        ConcreteComponent component = new ConcreteComponent();
        DecoratorOne decoratorOne = new DecoratorOne();
        DecoratorTwo decoratorTwo = new DecoratorTwo();
        decoratorOne.setComponent(component);
        decoratorTwo.setComponent(decoratorOne);
        decoratorTwo.operation("biao");
    }
}
