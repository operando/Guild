package com.os.operando.guild;

/**
 * A tuple of five elements.
 *
 * @param <F>  first element type
 * @param <S>  second element type
 * @param <T>  third element type
 * @param <FO> fourth element type
 * @param <FI> five element type
 */
public class Quintet<F, S, T, FO, FI> {

    private final F first;
    private final S second;
    private final T third;
    private final FO fourth;
    private final FI five;

    private Quintet(final F first, final S second, final T third, final FO fourth, FI five) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.five = five;
    }

    public static <F, S, T, FO, FI> Quintet<F, S, T, FO, FI> create(F first, S second, T third, FO fourth, FI five) {
        return new Quintet<>(first, second, third, fourth, five);
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
}