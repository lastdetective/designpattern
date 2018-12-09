package com.oreilly.designpattern.decorate;

/**
 * Created by Administrator on 2018/11/18.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    double cost() {
        return 1.99;
    }
}
