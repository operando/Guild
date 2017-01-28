package com.os.operando.guild.sample;

import com.os.operando.guild.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

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
    }
}
