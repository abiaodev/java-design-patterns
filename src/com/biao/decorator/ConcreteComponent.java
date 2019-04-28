package com.biao.decorator;

class ConcreteComponent implements Component {
    private Component component;

    public ConcreteComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation(String name) {
        component.operation(name);
    }
}
