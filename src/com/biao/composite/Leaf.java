package com.biao.composite;

import com.biao.Logger;

class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        Logger.LOG("can not add");
    }

    @Override
    public void remove(Component component) {
        Logger.LOG("can not remove");
    }

    @Override
    public void display(int depth) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            stringBuffer.append("-");
        }
        Logger.LOG(stringBuffer.toString() + "depth:" + depth + name);
    }
}
