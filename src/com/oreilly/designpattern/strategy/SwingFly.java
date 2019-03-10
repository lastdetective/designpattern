package com.oreilly.designpattern.strategy;

public class SwingFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with my swing");
    }
}
