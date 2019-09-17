package com.biao.decorator;

abstract class Decorator implements Component {
    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation(String name) {
        if (null != component) {
            component.operation(name);
        }
    }
}
