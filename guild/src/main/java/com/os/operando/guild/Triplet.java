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

    @Override
    public String toString() {
        return "Triplet{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triplet<?, ?, ?> triplet = (Triplet<?, ?, ?>) o;

        if (first != null ? !first.equals(triplet.first) : triplet.first != null) return false;
        if (second != null ? !second.equals(triplet.second) : triplet.second != null) return false;
        return third != null ? third.equals(triplet.third) : triplet.third == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        return result;
    }
}