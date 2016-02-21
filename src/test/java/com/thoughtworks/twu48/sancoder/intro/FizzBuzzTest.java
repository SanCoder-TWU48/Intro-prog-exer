package com.thoughtworks.twu48.sancoder.intro;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

//Created by SanCoder on 2/21/16.
public class FizzBuzzTest {
    @Test
    public void should_return_a_currect_output() {
        assertTrue(FizzBuzz.fizzBuzz().matches("[\\s\\S]*?14\nFizzBuzz[\\s\\S]*?94\nBuzz\nFizz[\\s\\S]*"));
    }
}