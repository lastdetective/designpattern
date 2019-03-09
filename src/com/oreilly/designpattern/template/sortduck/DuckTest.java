package com.oreilly.designpattern.template.sortduck;

import java.util.Arrays;

public class DuckTest {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Robin", 130),
                new Duck("Jack", 100),
                new Duck("Pony", 120),
                new Duck("Richard", 180)
        };

        Arrays.sort(ducks);
        for (Duck duck : ducks) {
            System.out.println(duck.toString());
        }
    }
}
