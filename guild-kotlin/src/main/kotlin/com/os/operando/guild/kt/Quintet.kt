package com.os.operando.guild.kt

import java.io.Serializable

/**
 * A tuple of five elements.
 *
 * @param F  first element type
 * @param S  second element type
 * @param T  third element type
 * @param FO fourth element type
 * @param FI five element type
 * @property first First value
 * @property second Second value
 * @property third Third value
 * @property fourth Fourth value
 * @property five Five value
 */
data class Quintet<out F, out S, out T, out FO, out FI>(
        val first: F,
        val second: S,
        val third: T,
        val fourth: FO,
        val five: FI) : Serializable {
    override fun toString(): String = "($first, $second, $third, $fourth, $five)"
}

infix fun <A, B, C, D, E, F> Quintet<A, B, C, D, E>.to(that: F): Sextet<A, B, C, D, E, F> = Sextet(this.first, this.second, this.third, this.fourth, this.five, that)

fun <T> Quintet<T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, five)