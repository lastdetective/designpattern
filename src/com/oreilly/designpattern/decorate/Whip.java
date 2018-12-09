package com.oreilly.designpattern.decorate;

/**
 * Created by Administrator on 2018/11/18.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    double cost() {
        return 1.2 + beverage.cost();
    }
}
