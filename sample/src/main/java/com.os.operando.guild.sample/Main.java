package com.os.operando.guild.sample;

import com.os.operando.guild.*;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] s) {

        Pair<String, Integer> pair = Pair.create("pair", 0);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        Triplet<String, Integer, Boolean> triplet = Triplet.create("triplet", 0, false);
        System.out.println(triplet.getFirst());
        System.out.println(triplet.getSecond());
        System.out.println(triplet.getThird());

        Quartet<String, Integer, Boolean, LocalDate> quartet = Quartet.create("quartet", 0, false, LocalDate.now());
        System.out.println(quartet.getFirst());
        System.out.println(quartet.getSecond());
        System.out.println(quartet.getThird());
        System.out.println(quartet.getFourth());

        Quintet<String, Integer, Boolean, LocalDate, List<String>> quintet = Quintet.create("quintet", 0, false, LocalDate.now(), Arrays.asList("quintet"));
        System.out.println(quintet.getFirst());
        System.out.println(quintet.getSecond());
        System.out.println(quintet.getThird());
        System.out.println(quintet.getFourth());
        System.out.println(quintet.getFive());

        Sextet<String, Integer, Boolean, LocalDate, List<String>, Set<String>> sextet =
                Sextet.create("sextet", 0, false, LocalDate.now(), Arrays.asList("sextet"), Collections.singleton("sextet"));
        System.out.println(sextet.getFirst());
        System.out.println(sextet.getSecond());
        System.out.println(sextet.getThird());
        System.out.println(sextet.getFourth());
        System.out.println(sextet.getFive());
        System.out.println(sextet.getSix());

        Septet<String, Integer, Boolean, LocalDate, List<String>, Set<String>, Long> septet =
                Septet.create("septet", 0, false, LocalDate.now(), Arrays.asList("septet"), Collections.singleton("septet"), Long.MAX_VALUE);
        System.out.println(septet.getFirst());
        System.out.println(septet.getSecond());
        System.out.println(septet.getThird());
        System.out.println(septet.getFourth());
        System.out.println(septet.getFive());
        System.out.println(septet.getSix());
        System.out.println(septet.getSeven());

        Octet<String, Integer, Boolean, LocalDate, List<String>, Set<String>, Long, UUID> octet =
                Octet.create("octet", 0, false, LocalDate.now(), Arrays.asList("octet"), Collections.singleton("octet"), Long.MAX_VALUE, UUID.randomUUID());
        System.out.println(octet.getFirst());
        System.out.println(octet.getSecond());
        System.out.println(octet.getThird());
        System.out.println(octet.getFourth());
        System.out.println(octet.getFive());
        System.out.println(octet.getSix());
        System.out.println(octet.getSeven());
        System.out.println(octet.getEight());

        Ennead<String, Integer, Boolean, LocalDate, List<String>, Set<String>, Long, UUID, StringBuilder> ennead =
                Ennead.create("ennead", 0, false, LocalDate.now(), Arrays.asList("ennead"), Collections.singleton("ennead"), Long.MAX_VALUE, UUID.randomUUID(), new StringBuilder("ennead"));
        System.out.println(ennead.getFirst());
        System.out.println(ennead.getSecond());
        System.out.println(ennead.getThird());
        System.out.println(ennead.getFourth());
        System.out.println(ennead.getFive());
        System.out.println(ennead.getSix());
        System.out.println(ennead.getSeven());
        System.out.println(ennead.getEight());
        System.out.println(ennead.getNine());
    }
}
