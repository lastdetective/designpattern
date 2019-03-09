package com.oreilly.designpattern.template.beverage;

public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        TeaWithHook teaWithHook = new TeaWithHook();

        System.out.println("making coffee now...");
        coffeeWithHook.prepareRecipe();


        System.out.println("making tea now...");
        teaWithHook.prepareRecipe();

    }
}
