package com.para.javabase.observer;

public class ConcreteSubject extends Subject {


    public void doSomething() {
        System.out.println("主题更新了，告诉观察者吧");
        super.notifyObserver();
    }
}
