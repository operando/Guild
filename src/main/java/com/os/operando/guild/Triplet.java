package com.os.operando.guild;

/**
 * A tuple of three elements.
 *
 * @param <F> first element type
 * @param <S> second element type
 * @param <T> thread element type
 */
public class Triplet<F, S, T> {

    private final F first;
    private final S second;
    private final T thread;

    private Triplet(final F first, final S second, final T thread) {
        this.first = first;
        this.second = second;
        this.thread = thread;
    }

    public static <F, S, T> Triplet<F, S, T> create(F first, S second, T thread) {
        return new Triplet<>(first, second, thread);
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
}