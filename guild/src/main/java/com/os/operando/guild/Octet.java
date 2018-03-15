package com.os.operando.guild;

/**
 * A tuple of eight elements.
 *
 * @param <F>  first element type
 * @param <S>  second element type
 * @param <T>  third element type
 * @param <FO> fourth element type
 * @param <FI> five element type
 * @param <SI> six element type
 * @param <SE> seven element type
 * @param <E>  eight element type
 */
public class Octet<F, S, T, FO, FI, SI, SE, E> {

    private final F first;
    private final S second;
    private final T third;
    private final FO fourth;
    private final FI five;
    private final SI six;
    private final SE seven;
    private final E eight;

    private Octet(final F first, final S second, final T third, final FO fourth, final FI five, final SI six, final SE seven, final E eight) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.five = five;
        this.six = six;
        this.seven = seven;
        this.eight = eight;
    }

    public static <F, S, T, FO, FI, SI, SE, E> Octet<F, S, T, FO, FI, SI, SE, E> create(F first, S second, T third, FO fourth, FI five, SI six, SE seven, E eight) {
        return new Octet<>(first, second, third, fourth, five, six, seven, eight);
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

    public SE getSeven() {
        return seven;
    }

    public E getEight() {
        return eight;
    }
}