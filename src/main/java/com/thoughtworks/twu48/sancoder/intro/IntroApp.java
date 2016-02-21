package com.thoughtworks.twu48.sancoder.intro;//Created by SanCoder on 2/21/16.

public class IntroApp {

    public static void main(String args[]) {
        exercisePrinter();
    }

    public static void exercisePrinter() {

        System.out.println(StarMaker.mkAStar());

        System.out.println(StarMaker.mkHorizontalLine(8));

        System.out.println(StarMaker.mkVerticalLine(3));

        System.out.println(StarMaker.mkRightTriangle(3));
    }
}
