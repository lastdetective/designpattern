package com.oreilly.designpattern.strategy;

public class LittleYellowDuck extends Duck {
    LittleYellowDuck() {
        quackBehavior = new LoudQuack();
        flyBehavior = new SwingFly();

    }

    @Override
    void display() {
        System.out.println("hello everyone, i am a little yellow duck");
    }
}
