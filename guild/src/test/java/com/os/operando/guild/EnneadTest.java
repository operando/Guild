package com.os.operando.guild;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class EnneadTest {

    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance();
        List<String> strings = Arrays.asList("ennead");
        Set<String> set = Collections.singleton("ennead");
        UUID uuid = UUID.randomUUID();
        StringBuilder sb = new StringBuilder("ennead");
        Ennead<String, Integer, Boolean, Calendar, List<String>, Set<String>, Long, UUID, StringBuilder> ennead =
                Ennead.create("ennead", 0, false, calendar, strings, set, Long.MAX_VALUE, uuid, sb);
        assertThat(ennead.getFirst(), is("ennead"));
        assertThat(ennead.getSecond(), is(0));
        assertThat(ennead.getThird(), is(false));
        assertThat(ennead.getFourth(), is(calendar));
        assertThat(ennead.getFive(), is(strings));
        assertThat(ennead.getSix(), is(set));
        assertThat(ennead.getSeven(), is(Long.MAX_VALUE));
        assertThat(ennead.getEight(), is(uuid));
        assertThat(ennead.getNine(), is(sb));
    }
}