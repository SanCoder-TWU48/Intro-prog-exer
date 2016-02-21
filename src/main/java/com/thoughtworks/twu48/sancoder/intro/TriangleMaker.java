package com.thoughtworks.twu48.sancoder.intro;//Created by SanCoder on 2/21/16.

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class TriangleMaker {

    public static String mkAStar() {
        return "*";
    }

    public static String mkHorizontalLine(int count) {
        return StringUtils.repeat(mkAStar(), count);
    }

    public static String mkVerticalLine(int count) {
        String[] stars = new String[count];
        Arrays.fill(stars, mkAStar());
        return StringUtils.join(stars, '\n');
    }
}
