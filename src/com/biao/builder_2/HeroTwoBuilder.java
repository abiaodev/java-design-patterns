package com.biao.builder_2;

class HeroTwoBuilder implements HeroDressBuilder {
    private String name;
    private String head;
    private String hand;
    private String foot;

    @Override
    public HeroTwoBuilder withName(String name) {
        this.name = "HeroTwoBuilder" + name;
        return this;
    }

    @Override
    public HeroTwoBuilder withHead(String head) {
        this.head = head;
        return this;
    }

    @Override
    public HeroTwoBuilder withHand(String hand) {
        this.hand = hand;
        return this;
    }

    @Override
    public HeroTwoBuilder withFoot(String foot) {
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
