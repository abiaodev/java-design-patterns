package com.biao.proxy;

import com.biao.Logger;

public class RealMovie implements Movie {
    @Override
    public void play() {
        Logger.LOG("Play real movie");
    }
}
