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

    @Override
    public String toString() {
        return "Quintet{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", five=" + five +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quintet<?, ?, ?, ?, ?> quintet = (Quintet<?, ?, ?, ?, ?>) o;

        if (first != null ? !first.equals(quintet.first) : quintet.first != null) return false;
        if (second != null ? !second.equals(quintet.second) : quintet.second != null) return false;
        if (third != null ? !third.equals(quintet.third) : quintet.third != null) return false;
        if (fourth != null ? !fourth.equals(quintet.fourth) : quintet.fourth != null) return false;
        return five != null ? five.equals(quintet.five) : quintet.five == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        result = 31 * result + (fourth != null ? fourth.hashCode() : 0);
        result = 31 * result + (five != null ? five.hashCode() : 0);
        return result;
    }
}