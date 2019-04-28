package com.biao.builder_2;

class HeroOneBuilder implements HeroDressBuilder {
    private String name;
    private String head;
    private String hand;
    private String foot;

    @Override
    public HeroOneBuilder withName(String name) {
        this.name = "HeroOneBuilder" + name;
        return this;
    }

    @Override
    public HeroOneBuilder withHead(String head) {
        this.head = head;
        return this;
    }

    @Override
    public HeroOneBuilder withHand(String hand) {
        this.hand = hand;
        return this;
    }

    @Override
    public HeroOneBuilder withFoot(String foot) {
        this.foot = foot;
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getHead() {
        return head;
    }

    @Override
    public String getHand() {
        return hand;
    }

    @Override
    public String getFoot() {
        return foot;
    }

    @Override
    public HeroDress build() {
        return new HeroDress(this);
    }
}
