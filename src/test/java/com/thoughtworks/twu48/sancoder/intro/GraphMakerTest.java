package com.thoughtworks.twu48.sancoder.intro;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

//Created by SanCoder on 2/21/16.
public class GraphMakerTest {

    @Test
    public void should_make_a_dot() {
        assertThat("mkDot", GraphMaker.mkDot(), equalTo("*"));
    }

    @Test
    public void should_make_a_horizontal_line() {
        assertThat("mkHorizontalLine", GraphMaker.mkHorizontalLine(8), equalTo("********"));
    }

    @Test
    public void should_make_a_vertical_line() {
        assertThat("mkVerticalLine", GraphMaker.mkVerticalLine(3), equalTo("*\n*\n*"));
    }

    @Test
    public void should_make_a_right_triangle() {
        assertThat("mkRightTriangle",
                GraphMaker.mkRightTriangle(3),
                equalTo("*\n" +
                        "**\n" +
                        "***"));
    }

    @Test
    public void should_make_a_isosceles_triangle() {
        assertThat("mkIsoscelesTriangle",
                GraphMaker.mkIsoscelesTriangle(3),
                equalTo("  *  \n" +
                        " *** \n" +
                        "*****"));
    }

    @Test
    public void should_make_a_diamond() {
        assertThat("mkDiamond",
                GraphMaker.mkDiamond(3),
                equalTo("  *  \n" +
                        " *** \n" +
                        "*****\n" +
                        " *** \n" +
                        "  *  "));
    }
}