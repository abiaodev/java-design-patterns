package com.biao.builder_2;

/**
 * 装饰模式
 */
class App {
    public static void main(String[] arg) {
        HeroDress heroDress = new HeroOneBuilder()
                .withName("Abiao")
                .withHead("小红帽")
                .withHand("手表")
                .withFoot("耐克鞋")
                .build();
        heroDress.show();
        heroDress = new HeroTwoBuilder()
                .withName("Abiao")
                .withHead("小红帽")
                .withHand("手表")
                .withFoot("耐克鞋")
                .build();
        heroDress.show();
    }
}
