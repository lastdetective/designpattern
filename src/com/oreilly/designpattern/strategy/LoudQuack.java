package com.oreilly.designpattern.strategy;

public class LoudQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack loudly");
    }
}
