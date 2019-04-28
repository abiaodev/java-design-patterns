package com.biao.adapter;

import com.biao.Logger;

class Honda implements Car{
    @Override
    public void run() {
        Logger.LOG("Honda is run");
    }
}
