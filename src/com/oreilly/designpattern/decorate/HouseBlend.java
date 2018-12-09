package com.oreilly.designpattern.decorate;

/**
 * Created by Administrator on 2018/11/18.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend Coffee";
    }

    @Override
    double cost() {
        return 0.89;
    }
}
