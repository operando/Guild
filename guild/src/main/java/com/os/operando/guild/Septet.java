package com.os.operando.guild;

/**
 * A tuple of seven elements.
 *
 * @param <F>  first element type
 * @param <S>  second element type
 * @param <T>  third element type
 * @param <FO> fourth element type
 * @param <FI> five element type
 * @param <SI> six element type
 * @param <SE> seven element type
 */
public class Septet<F, S, T, FO, FI, SI, SE> {

    private final F first;
    private final S second;
    private final T third;
    private final FO fourth;
    private final FI five;
    private final SI six;
    private final SE seven;

    private Septet(final F first, final S second, final T third, final FO fourth, final FI five, final SI six, SE seven) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.five = five;
        this.six = six;
        this.seven = seven;
    }

    public static <F, S, T, FO, FI, SI, SE> Septet<F, S, T, FO, FI, SI, SE> create(F first, S second, T third, FO fourth, FI five, SI six, SE seven) {
        return new Septet<>(first, second, third, fourth, five, six, seven);
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

    @Override
    public String toString() {
        return "Septet{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", five=" + five +
                ", six=" + six +
                ", seven=" + seven +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Septet<?, ?, ?, ?, ?, ?, ?> septet = (Septet<?, ?, ?, ?, ?, ?, ?>) o;

        if (first != null ? !first.equals(septet.first) : septet.first != null) return false;
        if (second != null ? !second.equals(septet.second) : septet.second != null) return false;
        if (third != null ? !third.equals(septet.third) : septet.third != null) return false;
        if (fourth != null ? !fourth.equals(septet.fourth) : septet.fourth != null) return false;
        if (five != null ? !five.equals(septet.five) : septet.five != null) return false;
        if (six != null ? !six.equals(septet.six) : septet.six != null) return false;
        return seven != null ? seven.equals(septet.seven) : septet.seven == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        result = 31 * result + (fourth != null ? fourth.hashCode() : 0);
        result = 31 * result + (five != null ? five.hashCode() : 0);
        result = 31 * result + (six != null ? six.hashCode() : 0);
        result = 31 * result + (seven != null ? seven.hashCode() : 0);
        return result;
    }
}