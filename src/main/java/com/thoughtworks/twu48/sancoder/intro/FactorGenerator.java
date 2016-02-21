package com.thoughtworks.twu48.sancoder.intro;//Created by SanCoder on 2/21/16.

import java.util.ArrayList;
import java.util.List;

public class FactorGenerator {
    public static List<Integer> generate(int n) {
        return generate_iter(n, 2, new ArrayList<Integer>());
    }

    private static List<Integer> generate_iter(int n, int i, List<Integer> l) {
        if(i > Math.sqrt(n)) {
            return l;
        } else if(n % i == 0){
            l.add(i);
            return generate_iter(n, i + 1, l);
        } else {
            return generate_iter(n, i + 1, l);
        }
    }
}
