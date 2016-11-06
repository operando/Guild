package com.os.operando.guild.sample;

import com.os.operando.guild.Pair;
import com.os.operando.guild.Quartet;
import com.os.operando.guild.Triplet;

import java.time.LocalDate;

public class Main {

    public static void main(String[] s) {

        Pair<String, Integer> pair = Pair.create("pair", 0);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        Triplet<String, Integer, Boolean> triplet = Triplet.create("triplet", 0, false);
        System.out.println(triplet.getFirst());
        System.out.println(triplet.getSecond());
        System.out.println(triplet.getThird());

        Quartet<String, Integer, Boolean, LocalDate> quartet = Quartet.create("triplet", 0, false, LocalDate.now());
        System.out.println(quartet.getFirst());
        System.out.println(quartet.getSecond());
        System.out.println(quartet.getThird());
        System.out.println(quartet.getFourth());
    }
}
