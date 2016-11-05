package com.os.operando.guild;

/**
 * A tuple of four elements.
 *
 * @param <F>  first element type
 * @param <S>  second element type
 * @param <T>  thread element type
 * @param <FO> fourth element type
 */
public class Quartet<F, S, T, FO> {

    private final F first;
    private final S second;
    private final T thread;
    private final FO fourth;

    private Quartet(final F first, final S second, final T thread, final FO fourth) {
        this.first = first;
        this.second = second;
        this.thread = thread;
        this.fourth = fourth;
    }

    public static <F, S, T, FO> Quartet<F, S, T, FO> create(F first, S second, T thread, FO fourth) {
        return new Quartet<>(first, second, thread, fourth);
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public T getThread() {
        return thread;
    }

    public FO getFourth() {
        return fourth;
    }
}