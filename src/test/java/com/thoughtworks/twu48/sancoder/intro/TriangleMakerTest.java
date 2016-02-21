package com.thoughtworks.twu48.sancoder.intro;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

//Created by SanCoder on 2/21/16.
public class TriangleMakerTest {

    @Test
    public void should_make_a_star() {
        assertThat("mkAStar", TriangleMaker.mkAStar(), equalTo("*"));
    }

    @Test
    public void should_make_a_horizontal_line() throws Exception {
        assertThat("mkHorizontalLine", TriangleMaker.mkHorizontalLine(), equalTo("********"));
    }
}