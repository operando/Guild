package com.os.operando.guild;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SeptetTest {

    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance();
        List<String> strings = Arrays.asList("septet");
        Set<String> set = Collections.singleton("septet");
        Septet<String, Integer, Boolean, Calendar, List<String>, Set<String>, Long> septet =
                Septet.create("septet", 0, false, calendar, strings, set, Long.MAX_VALUE);
        assertThat(septet.getFirst(), is("septet"));
        assertThat(septet.getSecond(), is(0));
        assertThat(septet.getThird(), is(false));
        assertThat(septet.getFourth(), is(calendar));
        assertThat(septet.getFive(), is(strings));
        assertThat(septet.getSix(), is(set));
        assertThat(septet.getSeven(), is(Long.MAX_VALUE));
    }
}