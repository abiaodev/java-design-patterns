package com.biao.iterator;

import java.util.ArrayList;
import java.util.List;

class ConcreteAggregate extends Aggregate {
    private List<Object> objects = new ArrayList<>();
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    public int count(){
        return objects.size();
    }
    public Object getItem(int index){
        return objects.get(index);
    }
    public void setItem(int index, Object object){
        objects.add(index,object);
    }
}
