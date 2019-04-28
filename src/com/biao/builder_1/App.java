package com.biao.builder_1;

/**
 * 装饰模式
 */
class App {
    public static void main(String[] arg) {
        new HeroDress.Builder("abiao")
                .withHead("小红帽")
                .withHand("手表")
                .withFoot("耐克鞋")
                .build()
                .show();
    }
}
