package com.oreilly.designpattern.decorate;

/**
 * Created by Administrator on 2018/11/18.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    double cost() {
        return .20 + beverage.cost();
    }
}
