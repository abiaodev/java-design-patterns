package com.biao.builder_2;

interface HeroDressBuilder {
    HeroDressBuilder withName(String name);

    HeroDressBuilder withHead(String head);

    HeroDressBuilder withHand(String hand);

    HeroDressBuilder withFoot(String foot);

    String getName();
    String getHead();
    String getHand();
    String getFoot();
    HeroDress build();
}
