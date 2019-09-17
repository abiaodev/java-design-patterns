package com.biao.composite;

import com.biao.Logger;

import java.util.ArrayList;
import java.util.List;

class Composite extends Component {
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void display(int depth) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            stringBuffer.append("-");
        }
        Logger.LOG(stringBuffer.toString() + "depth:" + depth + name);
        for (Component component : components) {
            component.display(depth + 2);
        }
    }
}
