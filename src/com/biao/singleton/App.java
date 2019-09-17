package com.biao.singleton;

import com.biao.Logger;

/**
 * 单例模式
 */
class App {
    public static void main(String[] args) {
        boolean isSame = Singleton.getInstance() == Singleton.getInstance2();
        Logger.LOG("isSame:" + isSame);
    }
}
