package com.os.operando.guild;

/**
 * A tuple of four elements.
 *
 * @param <F>  first element type
 * @param <S>  second element type
 * @param <T>  third element type
 * @param <FO> fourth element type
 */
public class Quartet<F, S, T, FO> {

    private final F first;
    private final S second;
    private final T third;
    private final FO fourth;

    private Quartet(final F first, final S second, final T third, final FO fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public static <F, S, T, FO> Quartet<F, S, T, FO> create(F first, S second, T third, FO fourth) {
        return new Quartet<>(first, second, third, fourth);
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

    @Override
    public String toString() {
        return "Quartet{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                '}';
    }
}