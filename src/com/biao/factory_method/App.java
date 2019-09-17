package com.biao.factory_method;

/**
 * 工厂方法模式
 */
public class App {
    public static void main(String[] args){
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct();
        product.desc();
    }
}
