package com.biao.state;

import com.biao.Logger;

class ConcreteStateOne implements State {
    @Override
    public void handle(Work work) {
        if (work.getHour() < 9) {
            //Logger.LOG("ConcreteStateOne:当前时间:" + work.getHour() + "工作描述:" + work.getDesc());
        } else {
            work.setState(new ConcreteStateTwo());
            work.setDesc("正在上上午的班，累死");
        }
    }
}
