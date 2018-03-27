package com.os.operando.guild.kt

import java.io.Serializable

/**
 * A tuple of seven elements.
 *
 * @param F  first element type
 * @param S  second element type
 * @param T  third element type
 * @param FO fourth element type
 * @param FI five element type
 * @param SI six element type
 * @param SE seven element type
 * @property first First value
 * @property second Second value
 * @property third Third value
 * @property fourth Fourth value
 * @property five Five value
 * @property six Six value
 * @property seven Seven value
 */
data class Septet<out F, out S, out T, out FO, out FI, out SI, out SE>(
        val first: F,
        val second: S,
        val third: T,
        val fourth: FO,
        val five: FI,
        val six: SI,
        val seven: SE) : Serializable {
    override fun toString(): String = "($first, $second, $third, $fourth, $five, $six, $seven)"
}

infix fun <A, B, C, D, E, F, G, H> Septet<A, B, C, D, E, F, G>.to(that: H): Octet<A, B, C, D, E, F, G, H>
        = Octet(this.first, this.second, this.third, this.fourth, this.five, this.six, this.seven, that)

fun <T> Septet<T, T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, five, six, seven)