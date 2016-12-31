package com.os.operando.guild;

/**
 * A tuple of six elements.
 *
 * @param <F>  first element type
 * @param <S>  second element type
 * @param <T>  third element type
 * @param <FO> fourth element type
 * @param <FI> five element type
 * @param <SI> six element type
 */
public class Sextet<F, S, T, FO, FI, SI> {

    private final F first;
    private final S second;
    private final T third;
    private final FO fourth;
    private final FI five;
    private final SI six;

    private Sextet(final F first, final S second, final T third, final FO fourth, final FI five, final SI six) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.five = five;
        this.six = six;
    }

    public static <F, S, T, FO, FI, SI> Sextet<F, S, T, FO, FI, SI> create(F first, S second, T third, FO fourth, FI five, SI six) {
        return new Sextet<>(first, second, third, fourth, five, six);
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

    public FO getFourth() {
        return fourth;
    }

    public FI getFive() {
        return five;
    }

    public SI getSix() {
        return six;
    }
}