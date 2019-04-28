package com.biao.builder_2;

import com.biao.Logger;

class HeroDress {
    private String name;
    private String head;
    private String hand;
    private String foot;

    public HeroDress(HeroDressBuilder builder) {
        this.name = builder.getName();
        this.head = builder.getHead();
        this.hand = builder.getHand();
        this.foot = builder.getFoot();
    }

    public void show() {
        Logger.LOG("name:" + name);
        Logger.LOG("head:" + head);
        Logger.LOG("hand:" + hand);
        Logger.LOG("foot:" + foot);
    }
}
