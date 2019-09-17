package com.biao.facade;

import com.biao.Logger;

/**
 * 外观模式
 */
class App {
    public static void main(String[] args) {
        Logger.LOG(2.0-1.1+"");
        ActivityFacade activityFacade = new ActivityFacade();
        activityFacade.startDay();
        activityFacade.work();
        activityFacade.endDay();
    }
}
