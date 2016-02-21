package com.thoughtworks.twu48.sancoder.intro;//Created by SanCoder on 2/21/16.

public class IntroApp {

    public static void main(String args[]) {
        exercisePrinter();
    }

    public static void exercisePrinter() {

        print(StarMaker.mkAStar());
        print(StarMaker.mkHorizontalLine(8));
        print(StarMaker.mkVerticalLine(3));
        print(StarMaker.mkRightTriangle(3));
        print(StarMaker.mkIsoscelesTriangle(3));
    }

    private static void print(String graph) {
        System.out.println("==========================");
        System.out.println("");
        System.out.println(graph);
        System.out.println("");
    }
}
