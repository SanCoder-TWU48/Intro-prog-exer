package com.thoughtworks.twu48.sancoder.intro;

import org.junit.Test;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

//Created by SanCoder on 2/21/16.
public class FactorGeneratorTest {

    @Test
    public void should_generate_the_factors() {
        assertThat(FactorGenerator.generate(30), contains(2, 3, 5));
    }
}