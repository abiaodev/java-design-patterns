package com.biao.state;

/**
 * 状态模式
 */
class App {
    public static void main(String[] args) {
        Work work = new Work(new ConcreteStateOne());
        //Logger.LOG(work.getDesc());

        work.setHour(8);
        work.request();
        //Logger.LOG(work.getDesc());

        work.setHour(9);
        work.request();
        //Logger.LOG(work.getDesc());

        work.setHour(10);
        work.request();
        //Logger.LOG(work.getDesc());

        work.setHour(12);
        work.request();
        //Logger.LOG(work.getDesc());

        work.setHour(16);
        work.request();
        //Logger.LOG(work.getDesc());

        work.setHour(18);
        work.request();
        //Logger.LOG(work.getDesc());

        work.setHour(20);
        work.request();
        //Logger.LOG(work.getDesc());

        work.setHour(24);
        work.request();
        //Logger.LOG(work.getDesc());
    }
}
