package com.os.operando.guild;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QuintetTest {

    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance();
        List<String> strings = Arrays.asList("quintet");
        Quintet<String, Integer, Boolean, Calendar, List<String>> quintet = Quintet.create("quintet", 0, false, calendar, strings);
        assertThat(quintet.getFirst(), is("quintet"));
        assertThat(quintet.getSecond(), is(0));
        assertThat(quintet.getThird(), is(false));
        assertThat(quintet.getFourth(), is(calendar));
        assertThat(quintet.getFive(), is(strings));
    }
}