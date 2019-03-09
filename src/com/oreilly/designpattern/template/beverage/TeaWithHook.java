package com.oreilly.designpattern.template.beverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }
        return false;

    }

    @Override
    void addCondiments() {
        System.out.println("Add Lemon into your tea?");

    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }


    String getUserInput() {
        String answer = null;
        System.out.println("Would you like some lemon into your tea? (yes/no)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            System.err.println("IO error when trying to read your answer");
        }
        if (answer == null) {
            answer = "no";
        }
        return answer;
    }

}
