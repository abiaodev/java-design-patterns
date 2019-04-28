package com.biao.state;

import com.biao.Logger;

class ConcreteStateFour implements State {
    @Override
    public void handle(Work work) {
        if (work.getHour() < 24) {
            //Logger.LOG("ConcreteStateFour:当前时间:" + work.getHour() + "工作描述:" + work.getDesc());
        } else {
            work.setState(new ConcreteStateOne());
            work.setDesc("睡觉，下一天重复");
        }
    }
}
