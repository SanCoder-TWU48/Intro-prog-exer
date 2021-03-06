package com.thoughtworks.twu48.sancoder.intro;//Created by SanCoder on 2/21/16.

import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;

public class GraphMaker {

    public static String mkDot() {
        return "*";
    }

    public static String mkHorizontalLine(int count) {
        return StringUtils.repeat(mkDot(), count);
    }

    public static String mkVerticalLine(int count) {
        String[] stars = new String[count];
        Arrays.fill(stars, mkDot());
        return StringUtils.join(stars, '\n');
    }

    public static String mkRightTriangle(int count) {
        String[] lines = new String[count];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = mkHorizontalLine(i+1);
        }
        return StringUtils.join(lines, '\n');
    }

    public static String mkIsoscelesTriangle(int count) {
        int lineSize = count * 2 - 1;
        String[] lines = new String[count];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = StringUtils.center(mkHorizontalLine(i * 2 + 1), lineSize);
        }
        return StringUtils.join(lines, '\n');
    }

    public static String mkDiamond(int count) {
        int size = count * 2 - 1;
        String[] lines = new String[size];
        for (int i = 0; i < lines.length; i++) {
            int dotNum = 2 * (count - Math.abs(count - 1 - i)) - 1;
            lines[i] = StringUtils.center(mkHorizontalLine(dotNum), size);
        }
        return StringUtils.join(lines, '\n');
    }

    public static String mkDiamondWithName(int count, String name) {
        int height = count * 2 - 1;
        int width = Math.max(height, name.length() / 2 * 2 + 1);
        String[] lines = new String[height];
        for (int i = 0; i < lines.length; i++) {
            int dotNum = 2 * (count - Math.abs(count - 1 - i)) - 1;
            lines[i] = StringUtils.center(mkHorizontalLine(dotNum), width);
        }
        lines[count - 1] = StringUtils.center(name, width);
        return StringUtils.join(lines, '\n');
    }
}
