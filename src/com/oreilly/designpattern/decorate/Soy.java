package com.oreilly.designpattern.decorate;

/**
 * Created by Administrator on 2018/11/18.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    double cost() {
        return beverage.cost() + .1;
    }
}
