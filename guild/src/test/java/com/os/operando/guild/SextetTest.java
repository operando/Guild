package com.os.operando.guild;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SextetTest {

    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance();
        List<String> strings = Arrays.asList("sextet");
        Set<String> set = Collections.singleton("sextet");
        Sextet<String, Integer, Boolean, Calendar, List<String>, Set<String>> sextet =
                Sextet.create("sextet", 0, false, calendar, Arrays.asList("sextet"), set);
        assertThat(sextet.getFirst(), is("sextet"));
        assertThat(sextet.getSecond(), is(0));
        assertThat(sextet.getThird(), is(false));
        assertThat(sextet.getFourth(), is(calendar));
        assertThat(sextet.getFive(), is(strings));
        assertThat(sextet.getSix(), is(set));
    }
}