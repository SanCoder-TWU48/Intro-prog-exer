package com.thoughtworks.twu48.sancoder.intro;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

//Created by SanCoder on 2/21/16.
public class StarMakerTest {

    @Test
    public void should_make_a_star() {
        assertThat("mkAStar", StarMaker.mkAStar(), equalTo("*"));
    }

    @Test
    public void should_make_a_horizontal_line() {
        assertThat("mkHorizontalLine", StarMaker.mkHorizontalLine(8), equalTo("********"));
    }

    @Test
    public void should_make_a_vertical_line() {
        assertThat("mkVerticalLine", StarMaker.mkVerticalLine(3), equalTo("*\n*\n*"));
    }

    @Test
    public void should_make_a_right_triangle() {
        assertThat("mkRightTriangle", StarMaker.mkRightTriangle(3), equalTo("*\n**\n***"));
    }
}