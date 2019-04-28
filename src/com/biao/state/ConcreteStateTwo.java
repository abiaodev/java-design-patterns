package com.biao.state;

import com.biao.Logger;

class ConcreteStateTwo implements State {
    @Override
    public void handle(Work work) {
        if (work.getHour() < 12) {
            //Logger.LOG("ConcreteStateTwo:当前时间:" + work.getHour() + "工作描述:" + work.getDesc());
        } else {
            work.setState(new ConcreteStateThree());
            work.setDesc("正在上下午的班，累死");
        }
    }
}
