package com.os.operando.guild;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TripletTest {

    @Test
    public void test() {
        Triplet<String, Integer, Boolean> triplet = Triplet.create("triplet", 0, false);
        assertThat(triplet.getFirst(), is("triplet"));
        assertThat(triplet.getSecond(), is(0));
        assertThat(triplet.getThird(), is(false));
    }
}