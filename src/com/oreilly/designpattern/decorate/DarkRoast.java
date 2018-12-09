package com.oreilly.designpattern.decorate;

/**
 * Created by Administrator on 2018/11/18.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast Coffee";
    }

    @Override
    double cost() {
        return 2.7;
    }
}
