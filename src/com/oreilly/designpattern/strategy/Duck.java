package com.oreilly.designpattern.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void display();

    /**
     * 每只鸭子都会划水，并且划水动作相同
     */
    void swim() {
        System.out.println("All ducks swim now");
    }

    void performFlye() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

}
