package com.biao.builder_1;

import com.biao.Logger;

class HeroDress {
    private String name;
    private String head;
    private String hand;
    private String foot;

    public HeroDress(Builder builder) {
        this.name = builder.name;
        this.head = builder.head;
        this.hand = builder.hand;
        this.foot = builder.foot;
    }

    public void show() {
        Logger.LOG("name:" + name);
        Logger.LOG("head:" + head);
        Logger.LOG("hand:" + hand);
        Logger.LOG("foot:" + foot);
    }

    public static class Builder {
        String name;
        String head;
        String hand;
        String foot;

        public Builder(String name) {
            this.name = name;
        }

        public Builder withHead(String head) {
            this.head = head;
            return this;
        }

        public Builder withHand(String hand) {
            this.hand = hand;
            return this;
        }

        public Builder withFoot(String foot) {
            this.foot = foot;
            return this;
        }

        public HeroDress build() {
            return new HeroDress(this);
        }
    }
}
