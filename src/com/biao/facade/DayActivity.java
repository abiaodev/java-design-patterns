package com.biao.facade;

import com.biao.Logger;

abstract class DayActivity {
    public void getUp() {
        Logger.LOG("getUp:" + name());
    }

    public void wash() {
        Logger.LOG("wash:" + name());
    }

    public void doWork() {
        Logger.LOG("do " + work() + " name: " + name());
    }

    public void goHome() {
        Logger.LOG("goHome:" + name());
    }

    public void goToSleep() {
        Logger.LOG("goToSleep:" + name());
    }

    private void action(ACTION action) {
        switch (action) {
            case GET_UP:
                getUp();
                break;
            case WASH:
                wash();
                break;
            case WORK:
                doWork();
                break;
            case GO_HOME:
                goHome();
                break;
            case GO_TO_SLEEP:
                goToSleep();
                break;
            default:
                break;
        }
    }

    public void action(ACTION... actions) {
        for (ACTION action : actions) {
            action(action);
        }
    }

    protected abstract String name();

    protected abstract String work();

    public enum ACTION {
        GET_UP, WASH, WORK, GO_HOME, GO_TO_SLEEP
    }
}
