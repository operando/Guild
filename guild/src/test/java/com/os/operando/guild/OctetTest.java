package com.os.operando.guild;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OctetTest {

    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance();
        List<String> strings = Arrays.asList("octet");
        Set<String> set = Collections.singleton("octet");
        UUID uuid = UUID.randomUUID();
        Octet<String, Integer, Boolean, Calendar, List<String>, Set<String>, Long, UUID> octet =
                Octet.create("octet", 0, false, calendar, strings, set, Long.MAX_VALUE, uuid);
        assertThat(octet.getFirst(), is("octet"));
        assertThat(octet.getSecond(), is(0));
        assertThat(octet.getThird(), is(false));
        assertThat(octet.getFourth(), is(calendar));
        assertThat(octet.getFive(), is(strings));
        assertThat(octet.getSix(), is(set));
        assertThat(octet.getSeven(), is(Long.MAX_VALUE));
        assertThat(octet.getEight(), is(uuid));
    }
}