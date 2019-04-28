package com.biao.state;

import com.biao.Logger;

class Work {
    private State state;
    private int hour = 8;
    private String desc = "没上班，真舒服";

    public Work(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
        Logger.LOG(desc);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
