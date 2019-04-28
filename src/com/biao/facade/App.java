package com.biao.facade;

/**
 * 外观模式
 */
class App {
    public static void main(String[] args) {
        ActivityFacade activityFacade = new ActivityFacade();
        activityFacade.startDay();
        activityFacade.work();
        activityFacade.endDay();
    }
}
