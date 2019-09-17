package com.biao.singleton;

class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    /**
     * 双重锁定
     * @return
     */
    public static Singleton getInstance2() {
        Singleton instance = INSTANCE;
        if (null == instance) {
            synchronized (Singleton.class) {
                instance = INSTANCE;
                if (instance == null){
                    instance = INSTANCE = new Singleton();
                }
            }
        }
        return instance;
    }
}
