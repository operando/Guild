package com.os.operando.guild;

/**
 * A tuple of two elements.
 *
 * @param <F> first element type
 * @param <S> second element type
 */
public class Pair<F, S> {

    private final F first;
    private final S second;

    private Pair(final F first, final S second) {
        this.first = first;
        this.second = second;
    }

    public static <F, S> Pair<F, S> create(F first, S second) {
        return new Pair<>(first, second);
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}