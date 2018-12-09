package com.oreilly.designpattern.decorate;

/**
 * Created by Administrator on 2018/11/18.
 */
abstract public class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    abstract double cost();
}
