package com.biao.adapter;

import com.biao.Logger;

class Cadillac implements Car{

    @Override
    public void run() {
        Logger.LOG("Cadillac is run");
    }
}
