package com.os.operando.guild;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Calendar;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QuartetTest {

    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance();
        Quartet<String, Integer, Boolean, Calendar> quartet = Quartet.create("quartet", 0, false, calendar);
        assertThat(quartet.getFirst(), is("quartet"));
        assertThat(quartet.getSecond(), is(0));
        assertThat(quartet.getThird(), is(false));
        assertThat(quartet.getFourth(), is(calendar));
    }
}