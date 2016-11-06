package com.os.operando.guild;

/**
 * A tuple of three elements.
 *
 * @param <F> first element type
 * @param <S> second element type
 * @param <T> third element type
 */
public class Triplet<F, S, T> {

    private final F first;
    private final S second;
    private final T third;

    private Triplet(final F first, final S second, final T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static <F, S, T> Triplet<F, S, T> create(F first, S second, T third) {
        return new Triplet<>(first, second, third);
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }
}