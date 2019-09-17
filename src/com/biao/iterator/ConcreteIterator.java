package com.biao.iterator;

class ConcreteIterator extends Iterator {
    private ConcreteAggregate concreteAggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public Object first() {
        return concreteAggregate.getItem(0);
    }

    @Override
    public Object next() {
        current++;
        if (current < concreteAggregate.count()) {
            return concreteAggregate.getItem(current);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return current >= concreteAggregate.count();
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.getItem(current);
    }
}
