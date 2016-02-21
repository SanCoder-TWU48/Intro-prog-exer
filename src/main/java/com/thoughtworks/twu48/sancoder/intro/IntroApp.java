package com.thoughtworks.twu48.sancoder.intro;//Created by SanCoder on 2/21/16.

public class IntroApp {

    public static void main(String args[]) {
        exercisePrinter();
    }

    public static void exercisePrinter() {

        print(GraphMaker.mkDot());
        print(GraphMaker.mkHorizontalLine(8));
        print(GraphMaker.mkVerticalLine(3));
        print(GraphMaker.mkRightTriangle(3));
        print(GraphMaker.mkIsoscelesTriangle(3));
    }

    private static void print(String graph) {
        System.out.println("==========================");
        System.out.println("");
        System.out.println(graph);
        System.out.println("");
    }
}
