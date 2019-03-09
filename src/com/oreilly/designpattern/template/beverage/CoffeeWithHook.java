package com.oreilly.designpattern.template.beverage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping Coffee with filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar With Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like some sugar or milk in your coffee(y/n)");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (Exception e) {
            System.err.println("IO error when trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
