package com.oreilly.designpattern.template.beverage;

/**
 * 模板方法模式
 * <p>
 * 使用钩子
 */

public abstract class CaffeineBeverageWithHook {
    void prepareRecipe() {
        /**
         * 每种饮料都需要将沸腾的水
         *
         */
        boilWater();

        /**
         * 每种饮料都需要泡
         * 不同的是 咖啡使用 冲泡
         * 茶使用浸泡
         */
        brew();

        /**
         * 每种饮料都需要将其倒入杯子中
         */
        pourInCup();

        /**
         * 如果用户需要一些额外的原料 比如加柠檬，牛奶，或者糖
         * 则需要使用这个方法
         */
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void addCondiments();

    abstract void brew();

    boolean customerWantsCondiments() {
        return true;
    }

    void boilWater() {
        System.out.println("Boiling Water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public static void main(String[] args) {
        System.out.println("你好");
    }
}