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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quartet<?, ?, ?, ?> quartet = (Quartet<?, ?, ?, ?>) o;

        if (first != null ? !first.equals(quartet.first) : quartet.first != null) return false;
        if (second != null ? !second.equals(quartet.second) : quartet.second != null) return false;
        if (third != null ? !third.equals(quartet.third) : quartet.third != null) return false;
        return fourth != null ? fourth.equals(quartet.fourth) : quartet.fourth == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        result = 31 * result + (fourth != null ? fourth.hashCode() : 0);
        return result;
    }
}