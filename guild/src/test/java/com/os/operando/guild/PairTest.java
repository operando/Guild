package com.os.operando.guild;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PairTest {

    @Test
    public void test() {
        Pair<String, Integer> pair = Pair.create("pair", 0);
        assertThat(pair.getFirst(), is("pair"));
        assertThat(pair.getSecond(), is(0));
    }
}