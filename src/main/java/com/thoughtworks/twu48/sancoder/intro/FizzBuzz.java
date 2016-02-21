package com.thoughtworks.twu48.sancoder.intro;//Created by SanCoder on 2/21/16.

public class FizzBuzz {
    public static String fizzBuzz() {
        String output = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output += "FizzBuzz\n";
            } else if (i % 3 == 0) {
                output += "Fizz\n";
            } else if (i % 5 == 0) {
                output += "Buzz\n";
            } else {
                output += i + "\n";
            }
        }
        return output;
    }
}
