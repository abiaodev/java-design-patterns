package com.biao.iterator;

import com.biao.Logger;

/**
 * 迭代器模式
 */
class App {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.setItem(0, "大鸟0");
        concreteAggregate.setItem(1, "大鸟1");
        concreteAggregate.setItem(2, "大鸟2");
        concreteAggregate.setItem(3, "大鸟3");
        concreteAggregate.setItem(4, "大鸟4");
        concreteAggregate.setItem(5, "大鸟5");
        Iterator iterator = new ConcreteIterator(concreteAggregate);
        while (!iterator.isDone()){
            Logger.LOG(iterator.currentItem()+"");
            iterator.next();
        }
    }
}
