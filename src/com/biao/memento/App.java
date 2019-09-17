package com.biao.memento;

/**
 * 备忘录模式
 */
class App {
    public static void main(String[] args){
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("Off");
        originator.show();

        originator.setMemento(caretaker.getMemento());
        originator.show();

    }
}
