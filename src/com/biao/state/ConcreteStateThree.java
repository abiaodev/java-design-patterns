package com.biao.state;

import com.biao.Logger;

class ConcreteStateThree implements State {
    @Override
    public void handle(Work work) {
        if (work.getHour() < 18) {
            //Logger.LOG("ConcreteStateThree:当前时间:" + work.getHour() + "工作描述:" + work.getDesc());
        } else {
            work.setState(new ConcreteStateFour());
            work.setDesc("下班了，真的好玩");
        }
    }
}
